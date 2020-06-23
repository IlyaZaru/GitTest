public class Iterator {

    public void printIterator(int count){
        String episode = "Episode";
        for (int i=0;i<count+1;i++){
            if (i<=episode.length()-1){
                System.out.println("Episode"+i+" "+episode.charAt(i));
            }
            else System.out.println("Episode"+i+" none");

        }
    }
}
