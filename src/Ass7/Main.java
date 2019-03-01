package Ass7;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        int flag = 0;
        Scanner scanner = new Scanner(System.in);
        ArrayList<News> newsArrayList = new ArrayList<News>();
        do {
            System.out.println("Menu:");
            System.out.println("1. Insert news");
            System.out.println("2. View list news");
            System.out.println("3. Average rate");
            System.out.println("4. Exit");
            int x;
            do{
                System.out.println("Choose a function:");
                x = scanner.nextInt();
            }while (x < 1 || x>4);
            if(x == 4){
                flag= 1;
            }

            switch (x){
                case 1:Main.insertNews(newsArrayList);break;
                case 2:Main.viewListNews(newsArrayList);break;
                case 3:Main.averageRate(newsArrayList);break;
            }

        }while (flag==0);

    }

    public static void insertNews(ArrayList<News> newsArrayList){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Title:");
        String title = scanner.nextLine();
        System.out.println("PublishDate:");
        String PublishDate = scanner.nextLine();
        System.out.println("Author: ");
        String Author = scanner.nextLine();
        System.out.println("Content: ");
        String Content = scanner.nextLine();
        int[] RateList = new int[3];
        System.out.println("RateList: ");
        for (int i=0;i<RateList.length;i++){
            RateList[i] = scanner.nextInt();
        }
        newsArrayList.add(new News((newsArrayList.size()+1),title,
                PublishDate,Author,Content,RateList));
    }

    public static void viewListNews(ArrayList<News> newsArrayList){
        for (News news:newsArrayList){
            news.Display();
        }
    }

    public static void averageRate(ArrayList<News> newsArrayList){
        for (News news:newsArrayList){
            news.Calculate();
            news.Display();
        }
    }

}