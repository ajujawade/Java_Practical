<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Factorial Result</title>
</head>
<body>
		<h1>Factorial Result</h1>
		<%
			String numberStr = request.getParameter("number");
			if(numberStr != null && !numberStr.isEmpty())
			{
				try
				{
					int number = Integer.parseInt(numberStr);
					if(number < 0)
					{
						out.println("<p style = 'color:red'>Please Enter a non-negative Integer.</p>");
					}
					else
					{
						long factorial = 1;
						for(int i = 1; i <= number; i++)
						{
							factorial *= i;
						}
						out.println("<p>The Factorial of " + number + " is " + factorial + ".</p>" );
					}
				}catch(NumberFormatException e )
				{
					out.println("<p style = 'color:red;'>Invalid Input.Please Enter an Integer.</p>");
				}
			}
			else
			{
				out.println("<p style = 'color:red;'>No Input Provided.Please Enter a Number.</p>");
			}
		
		%>
</body>
</html>