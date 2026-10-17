package lk.rasheeda.oodp.practical;

public class Test {

    public static void main(String[] args) {

        Request request = new Request("www.abc.com/a.jsp");
        request.addParameter("username","abc");
        request.addParameter("password","123");

        Filter1 filter1 = new Filter1();
        Filter2 filter2 = new Filter2();
        Filter3 filter3 = new Filter3();

        filter1.setHandler(filter2);
        filter2.setHandler(filter3);

        filter1.handleRequest(request);

    }

}
