package myPackage;
import java.util.Scanner;

public class BasketBallGame {
	private String firstTeam, secondTeam;
	private int firstScore, secondScore;
	private boolean statusOfGame; // if boolean was true, The status of the game in progress
	
	public void start()
	{
		statusOfGame = true;
		Scanner key = new Scanner(System.in);
		System.out.println("Start!!!");
		System.out.println("Enter the first and second team name:");
		firstTeam = key.next();
		secondTeam = key.next();
		firstScore = 0;
		secondScore = 0;
		
		while (true)
		{
			String team;
			int score;
			System.out.println("Enter the team and score(first team: a, second team: b)");
			System.out.println("if you enter 0, game finish");
			System.out.println("Example: if enter a 1, first team is scored");
			System.out.println("Enter a score:");
			team = key.next();
			score = key.nextInt();
			if (team.equals("0") || ((score <= 0) && (score > 3)))
			{
				gameFinish();
			}
			if (score == 1)
			{
				onePoint(team);
			}
			else if (score == 2)
			{
				twoPoint(team);
			}
			else
			{
				threePoint(team);
			}
			currentScore();
			
		}
		
	}
	private void onePoint(String team)
	{
		System.out.println(team.equals("a"));
		if (!team.equals("a") && !team.equals("b"))
		{
			System.out.println("Wrong team name");
			System.exit(0);
		}
		if (statusOfGame == false)
		{
			System.out.println("Game Finished");
			System.exit(0);
		}
		if (team.equals("a"))
		{
			firstScore++;
		} else
		{
			secondScore++;
		}
	}
	private void twoPoint(String team)
	{
		if (!team.equals("a") && !team.equals("b"))
		{
			System.out.println("Wrong team name");
			System.exit(0);
		}
		if (statusOfGame == false)
		{
			System.out.println("Game Finished");
			System.exit(0);
		}
		if (team.equals("a"))
		{
			firstScore += 2;
		} else
		{
			secondScore += 2;
		}
	}
	private void threePoint(String team)
	{
		if (!team.equals("a") && !team.equals("b"))
		{
			System.out.println("Wrong team name");
			System.exit(0);
		}
		if (statusOfGame == false)
		{
			System.out.println("Game Finished");
			System.exit(0);
		}
		if (team.equals("a"))
		{
			firstScore += 3;
		} else
		{
			secondScore += 3;
		}
	}
	private void gameFinish()
	{
		statusOfGame = false;
		System.exit(0);
	}
	private void currentScore() 
	{
		System.out.print(this.firstTeam + " " + this.firstScore + ", " +
							this.secondTeam + " " + this.secondScore + "; ");
		winning();
	}
	private void winning()
	{
		if (firstScore > secondScore)
		{
			System.out.println(firstTeam + " are winning.");
		} else if (firstScore < secondScore)
		{
			System.out.println(secondTeam + " are winning.");
		} else
		{
			System.out.println("Drawing!!");
		}
	}
	
	

}
