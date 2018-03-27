import java.io.*;

public class RedditReader {
	String fileToAnalyze;
	
	RedditReader()
	{
		fileToAnalyze = "";
	}
	
	void getPostsReddit(String fileToRead, String keywordToAnalyze)
	{
		RedditPost [] theDonaldPosts = new RedditPost[6465];
		
		try
		{
			FileReader myFileReader = new FileReader(fileToRead);
			BufferedReader myBufferReader = new BufferedReader(myFileReader);
			String line = null;
			int postCounter = 0;
			while ((line = myBufferReader.readLine()) != null)
			{
				line = myBufferReader.readLine();
				theDonaldPosts[postCounter] = new RedditPost(line);
				postCounter++;
				
				String lineToAnalyzeLowerCase = line.toLowerCase();
				
				if (lineToAnalyzeLowerCase.contains(keywordToAnalyze))
				{
					System.out.println(postCounter + ": " + line);
				}
			}
		}
		catch (Exception ex)
		{
			System.out.println("");
		}
	}

	void getAuthorReddit(String fileToRead, int lineNumber)
	{
		RedditAuthor [] theDonaldAuthors = new RedditAuthor[6465];
		
		if ( lineNumber >= 0 && lineNumber <= 6465)
		{
			try
			{
				FileReader myFileReader = new FileReader(fileToRead);
				BufferedReader myBufferReader = new BufferedReader(myFileReader);
				String line = null;
				int postCounter = 0;
				while ((line = myBufferReader.readLine()) != null)
				{
					line = myBufferReader.readLine();
					theDonaldAuthors[postCounter] = new RedditAuthor(line);
					postCounter++;
				}
				
			}
			catch (Exception ex)
			{
				System.out.println("I was not able to find your file.");
			}
		System.out.println("The author of the post is: " + theDonaldAuthors[lineNumber].author);
		}
		else
		{
			System.out.println("You have picked a number not in the parameters.");
		}
			
	}

	void getScoreReddit(String fileToRead, int lineNumber)
	{
		RedditScore [] theDonaldScore = new RedditScore[6465];
		
		if (lineNumber >= 0 && lineNumber <= 6465)
		{
			try
			{
				FileReader myFileReader = new FileReader(fileToRead);
				BufferedReader myBufferReader = new BufferedReader(myFileReader);
				String line = null;
				int postCounter = 0;
				while ((line = myBufferReader.readLine()) != null)
				{
					line = myBufferReader.readLine();
					theDonaldScore[postCounter] = new RedditScore(line);
					postCounter++;
				}	
			}
			catch (Exception ex)
			{
				System.out.println("I was not able to find your file.");
			}
			System.out.println("The score of this post is: " + theDonaldScore[lineNumber].score);
		}
		else
		{
			System.out.println("You have picked a number not in the parameters.");
		}
	}

	void getCommentReddit(String fileToRead, int lineNumber)
	{
	
		RedditComment [] theDonaldComment = new RedditComment[6465];
		
		if ( lineNumber >= 0 && lineNumber <= 6465)
		{
			try
			{
				FileReader myFileReader = new FileReader(fileToRead);
				BufferedReader myBufferReader = new BufferedReader(myFileReader);
				String line = null;
				int postCounter = 0;
				while ((line = myBufferReader.readLine()) != null)
				{
					line = myBufferReader.readLine();
					theDonaldComment[postCounter] = new RedditComment(line);
					postCounter++;
				}	
			}
			catch (Exception ex)
			{
				System.out.println("I was not able to find your file.");
			}
			System.out.println("The number of comments this post has is: " + theDonaldComment[lineNumber].comment);
		}
		else
		{
			System.out.println("You have picked a number not in the parameters.");
		}
		
	}

	void getGildedReddit(String fileToRead, int lineNumber)
	{
		RedditGilded [] theDonaldGilded = new RedditGilded[6465];
		
		if ( lineNumber >= 0 && lineNumber <= 6465)
		{
			try
			{
				FileReader myFileReader = new FileReader(fileToRead);
				BufferedReader myBufferReader = new BufferedReader(myFileReader);
				String line = null;
				int postCounter = 0;
				while ((line = myBufferReader.readLine()) != null)
				{
					line = myBufferReader.readLine();
					theDonaldGilded[postCounter] = new RedditGilded(line);
					postCounter++;
				}	
			}
			catch (Exception ex)
			{
				System.out.println("I was not able to find your file.");
			}
			System.out.println("The times this post has been gilded is: " + theDonaldGilded[lineNumber].gilded);
		}
		else
		{
			System.out.println("You have picked a number not in the parameters.");
		}
	

	}

}