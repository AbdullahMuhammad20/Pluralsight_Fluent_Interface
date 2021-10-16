package pluralsight.pages.search;

public class SearchPage{

    private SearchActController     act;
    private SearchVerifyController  verify;
    private SearchGetController get;

    public SearchGetController get(){
        return get;
    }

    // you can change name of this method such as "Steps"
    public SearchActController act(){
        return act;
    }
    // you can change name of this method such as "Check"
    public SearchVerifyController verify(){
        return verify;
    }

    private SearchPage(SearchActController act,SearchVerifyController verify) {
        this.act = act;
        this.verify = verify;
    }
    private SearchPage(){
        //hide it
    }

    public static SearchPage getSearchPage(){
        return new SearchPage(new SearchActController(),
               new SearchVerifyController());
    }







}
