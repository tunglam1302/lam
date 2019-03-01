package Ass7;

public class News implements INews {
    public int ID;
    public String Title;
    public String PublishDate;
    public String Author;
    public String Content;
    public float AverageRate ;

    public News(int ID, String title, String publishDate, String author, String content, int[] rateList) {
        this.ID = ID;
        Title = title;
        PublishDate = publishDate;
        Author = author;
        Content = content;
        RateList = rateList;
    }

    public int[] RateList = new int[3];

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getPublishDate() {
        return PublishDate;
    }

    public void setPublishDate(String publishDate) {
        PublishDate = publishDate;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public float getAverageRate() {
        return AverageRate;
    }

    @Override
    public void Display() {
        System.out.println(this.getTitle()+" -- "+ this.getPublishDate()+ " -- "+ this.getAuthor()+ " -- "+this.getContent()+" -- "+this.getAverageRate());
    }

    public void Calculate(){
        int total = 0;
        for (int rate:RateList){
            total+=rate;
        }
        AverageRate = (float)total/RateList.length;
    }

}