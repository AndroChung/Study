# 참고

## 디렉토리 정리
```
project/
│
├── data/                # 데이터 파일 저장 (e.g., CSV, JSON)
│   ├── raw/             # 원본 데이터
│   ├── processed/       # 전처리된 데이터
│
├── notebooks/           # Jupyter Notebook (.ipynb) 파일
│   ├── analysis.ipynb
│   ├── visualization.ipynb
│
├── src/                 # 소스코드 파일 (e.g., Python, C++, etc.)
│   ├── main.py
│   ├── utils.py
│   ├── models/
│   │   ├── regression.py
│   │   ├── neural_net.py
│
├── tests/               # 테스트 코드 (e.g., unit tests)
│   ├── test_utils.py
│   ├── test_models.py
│
├── docs/                # 문서화 (README, 프로젝트 설명)
│   ├── README.md
│   ├── requirements.txt
│   ├── documentation.pdf
│
├── results/             # 결과물 (e.g., 시각화, 모델 출력)
│   ├── figures/
│   ├── logs/
│
└── environment/         # 환경 관련 파일
    ├── environment.yml  # Conda 환경 파일
    ├── requirements.txt # pip 요구 사항
```

## Git

### System Config
- 시스템의  모든 사용자와 모든 저장소에 적용   
`git config --system`

### Global Config
- 시스템의 특정 사용자에게 적용   
`git config --global`

### Local Config
- 특정 저장소에 적용   
`git config --local`

### Usernmae & Email
`git config user.name <name>`
`git config user.email <email>`

### CRLF
`git config core,.autocrlf <value>`

- Line Ending은 OS마다 다름
    - Windows: CR(\r) + LF(\n)
    - Unix or Mac: LF(\n)

### Editor
`git config core.editor <editor>`

### Default Branch
`git config init.defaultBranch <name>`

### Git 전체 설정 확인
`git config -l`
`git config --list`

### Git 설치 범위 별 전체 설정 확인
`git config --list --show-origin`

### Git 개별 설정 확인
`git config <key>`
