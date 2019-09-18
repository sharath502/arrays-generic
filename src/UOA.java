public class UOA<T> {

    private int size;
    private int next;
    private T[] data;


    public UOA() {
        size = 100;
        next = 0;
        data = (T[]) new Object[size];
    }

    public UOA(int s) {
        size = s;
        next = 0;
        data = (T[]) new Object[s];
    }

    public boolean insert(T newListing){
        KeyMode node = (KeyMode) newListing;
        if(next >= size){
            return false;
        }

        data[next] = (T)node.deepCopy();

        if(data[next] == null){
            return false;
        } else {
            next = next + 1;
            return true;

        }
    }

    public KeyMode fetch(Object targetKey){
        KeyMode node = (KeyMode) data[0];
        T temp;

        int i = 0;
        while ( i < next && node.compareTo(targetKey) != 0){
            i++;
            node = (KeyMode)data[i];
        }

        if( i == next){
            return null;
        }
        node = node.deepCopy();

        if(i != 0){
            temp = data[i-1];
            data[i-1] = data[i];
            data[i] = temp;
        }
        return node;
    }

    public boolean delete(Object targetKey){
        KeyMode node = (KeyMode)data[0];
        int i = 0;
        while ( i < next && node.compareTo(targetKey) != 0){
            i++;
            node = (KeyMode)data[i];
        }
        if( i == next){
            return false;
        }
        data[i] = data[next - 1];
        data[next - 1] = null;
        next = next - 1;
        return true;
    }

    public boolean update(Object targetKey , T newNode){
        if( !delete(targetKey)){
            return false;
        } else if(!insert(newNode)){
            return false;
        } else {
            return true;
        }
    }

    public void showAll(){
        for( int i = 0 ; i<size ; i++){
            System.out.println(data[i].toString());
        }
    }
}
