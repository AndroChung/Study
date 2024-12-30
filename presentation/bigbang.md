# 웹 크롤링(The Big Bang Theory) 발표

![image](https://github.com/user-attachments/assets/664a0349-4df1-4bd6-a0e0-8cd2c035ab13)

## import 
``` python
import urllib
from urllib.request import urlopen
from urllib.request import Request
from bs4 import BeautifulSoup
import pandas as pd
import re
```

## Soup 가져오기 함수 정의
``` python
def getHtmlFromUrl(url):
    req = Request(url=url, headers={"User-agent":"Mozilla/5.0"})
    res = urlopen(req)
    return BeautifulSoup(res, "html.parser")
```

## URL 규칙 파악
- prefix: https://www.imdb.com/title/tt0898266/episodes/?season=

## 시즌 가져오기
![Screenshot from 2024-12-30 12-51-20](https://github.com/user-attachments/assets/539ca254-ea61-475d-b1db-ba2263bbbbe8)

## 메인 페이지 데이터 선택
![Screenshot from 2024-12-30 12-53-02](https://github.com/user-attachments/assets/2d2c6197-f7c1-45de-83c1-8172d2445027)

## 메인 페이지 데이터 추출

### 필요 데이터 추출 함수 정의
``` python
def getRateFromHtml(episodeHtml):
    return episodeHtml.find(class_="ipc-rating-star--rating").getText()

def getDateFromHtml(episodeHtml):
    return episodeHtml.find(class_="sc-f2169d65-10 bYaARM").getText()
```

### 데이터 추출
``` python
episodeList = []
dateList = []
rateList = []
seasonList = []

for seasonIdx in season:
    prefix = "https://www.imdb.com/title/tt0898266/episodes/?"
    url = prefix + "season=" + str(seasonIdx)
    html = getHtmlFromUrl(url)
    
    for idx, episodeHtml in enumerate(getEpisodeHtml(html)):
        episode = idx + 1
        rate = getRateFromHtml(episodeHtml)
        date = getDateFromHtml(episodeHtml)
        episodeList.append(episode)
        rateList.append(rate)
        dateList.append(date)
        seasonList.append(seasonIdx)
data = {"Season":seasonList, "Episode":episodeList, "Rate":rateList, "Date":dateList}
df = pd.DataFrame(data)
```

### 결과
![Screenshot from 2024-12-30 13-21-43](https://github.com/user-attachments/assets/12e11e09-e422-41a8-8d0c-be9e735ef51b)

## 각 Episode 별 페이지
![Screenshot from 2024-12-30 13-02-30](https://github.com/user-attachments/assets/c20313f0-f158-4e3d-ac4e-65625726ea78)
![Screenshot from 2024-12-30 13-05-46](https://github.com/user-attachments/assets/ef6a0105-c00d-43e9-9fe4-cf562984f279)

## 각 Episode 페이지 데이터 추출

### URL
![Screenshot from 2024-12-30 12-53-02](https://github.com/user-attachments/assets/2d2c6197-f7c1-45de-83c1-8172d2445027)

### 데이터 추출
``` python
from tqdm import tqdm
titleList = []
topcastList = []
prefix = "https://www.imdb.com"
for seasonIdx in tqdm(season, total=len(season)):
    url = prefix + "/title/tt0898266/episodes/?season=" + str(seasonIdx)
    html = getHtmlFromUrl(url)
    episodes = getEpisodeHtml(html)

    for episode in episodes:
        url = prefix + episode.find('a')["href"]
        html = getHtmlFromUrl(url)
        title = html.find(class_="hero__primary-text").string
        titleList.append(title)
        actors = html.find_all(class_="sc-cd7dc4b7-7 vCane")
        topcast = ""
        for idx, actor in enumerate(actors):
            actor = actor.find('a').string
            if idx == 0:
                topcast += actor.string
            else:
                topcast += (", " + actor.string)
        topcastList.append(topcast)
```

## DataFrame 정리
``` python
df["Title"] = titleList
df["Top Cast"] = topcastList
df = df.loc[:, ["Season", "Episode", "Title", "Top Cast", "Rate", "Date"]]
```

## 결과
![Screenshot from 2024-12-30 13-11-50](https://github.com/user-attachments/assets/ecc2955d-daff-4dd7-9d78-047aefc24f54)

