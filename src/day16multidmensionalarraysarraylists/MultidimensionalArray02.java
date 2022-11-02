package day16multidmensionalarraysarraylists;

public class MultidimensionalArray02 {

    public static void main(String[] args) {

        //Bir multidmensional array deki en buyuk ve wn kucuk elemanin toplamini veren kodu yaziniz

        int arr[][] = {{2, 5, 1}, {83, 75}};

    int maxElement = arr[0][0];
    int minElement = arr[0][0];
    for (int[] w : arr ){        //Bu array dir

        for (int k : w){        //Bu intgerdir

            maxElement = Math.max(maxElement , k );   //Maximum elemani buldum
            minElement = Math.min(minElement, k ) ;    //minimum elemani buldum
        }
    }

        System.out.println(maxElement); //83
        System.out.println(minElement); //1

        System.out.println(maxElement+minElement); //84

    }
}