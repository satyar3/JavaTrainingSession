package LambdaExpressions;

//SAM - Single Abstract Method -->Functional Interface

@FunctionalInterface
public interface WebPage
{
	void header(String headerValue);
	//void footer(String footer);
}
