public class cuartoPunto {
    public static void main (String[]args){
        int  [] strArr = new int [11];
        String separador = "";
        for ( int i = 1; i < strArr.length; i += 2) {
            strArr[i]=i;
            System . out . print ( separador + strArr [i]) ; separador= " , " ;
        }

    }
}
