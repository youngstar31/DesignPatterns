package structural.adapter;

import java.util.StringTokenizer;

public class EmployeeCSV {

    private int id;
    private String firstname;
    private String lastname;
    private String emailAddress;


    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public EmployeeCSV(String values) {
        //The StringTokenizer methods do not distinguish among identifiers, numbers,
        // and quoted strings, nor do they recognize and skip comments
        //The string tokenizer class allows an application to break a string into tokens

        //.hasMoreElements() - Tests if this enumeration contains more elements.
        //Returns:
        //true if and only if this enumeration object contains at least one more element to provide; false otherwise.
        StringTokenizer tokenizer = new StringTokenizer(values, ","); //delim (delimiters) character(s) that seperate tokens
        if (tokenizer.hasMoreElements()) {

            id = Integer.parseInt(tokenizer.nextToken()); //.nextToken - Returns the next token from this string tokenizer.
        }
        if (tokenizer.hasMoreElements()) {
            firstname = tokenizer.nextToken();
        }
        if (tokenizer.hasMoreElements()) {
            lastname = tokenizer.nextToken();
        }
        if (tokenizer.hasMoreElements()) {
            emailAddress = tokenizer.nextToken();
        }


    }


}

