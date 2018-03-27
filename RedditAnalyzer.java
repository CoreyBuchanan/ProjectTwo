import java.util.Scanner;

public class RedditAnalyzer {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int i = 0;
		String keywordToAnalyze = null;
		String additionalInfo = null;
		int lineNumber = 0;
		String searchAgain = null;
		
		while(i == 0)
		{
			System.out.println("Please enter the keyword you would like to search for: ");
			keywordToAnalyze = input.nextLine();
			
			System.out.println("These are the search results: ");
			RedditReader myReader = new RedditReader();
			myReader.getPostsReddit("redditPost.txt", keywordToAnalyze);
			
			System.out.println("Do you want the information regarding any posts?");
			additionalInfo = input.nextLine();
			
			if (additionalInfo.equalsIgnoreCase("yes"))
			{
				System.out.println("What is the line number of the post you want information on?");
				lineNumber = input.nextInt();
				
				RedditReader myNewReader1 = new RedditReader();
				myNewReader1.getAuthorReddit("redditAuthor.txt", lineNumber);
				
				RedditReader myNewReader2 = new RedditReader();
				myNewReader2.getScoreReddit("redditScore.txt", lineNumber);
				
				RedditReader myNewReader3 = new RedditReader();
				myNewReader3.getCommentReddit("redditComment.txt", lineNumber);
				
				RedditReader myNewReader4 = new RedditReader();
				myNewReader4.getGildedReddit("redditGilded.txt", lineNumber);
				}
		
			System.out.println("Do you need to search the database again?");

			input.nextLine();	
			searchAgain = input.nextLine();
			
			if (searchAgain.equalsIgnoreCase("yes"))
			{
				i = 0;
			}
			else
			{
				i = 1;
			}
		}
	}
}
