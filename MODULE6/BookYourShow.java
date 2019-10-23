class BookYourShow{
    Show[]shows;
    int noOfmovies;
    BookYourShow(){
        shows=new Show[5];
        noOfmovies=0;

    }
    public void addAShow(Show show){
        shows[noOfmovies++]=show;

    }
    public Show getAShow(String movieName,String dateT){
        for(int i=0;i<noOfmovies;i++){
            if(shows[i].getMovieName().equals(movieName)&& shows[i].getdateTime().equals(dateT)){
              return shows[i];
            }
        }
        return null;
    }
}