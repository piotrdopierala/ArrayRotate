public class GridChar {

    public static final char[] ALPHABET = "abcdefghijklmnoprstuwvxyzABCDEFGHIJKLMNOPRSTUWVXYZ123456789".toCharArray();
    public static final int MAX_SIZE = (int) Math.sqrt(ALPHABET.length);

    int size;
    char[][] data;

    public GridChar(int size) {
        if (size > MAX_SIZE)
            size = MAX_SIZE;
        this.size = size;
        this.data = new char[size][size];
    }

    public void fillChars() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                data[i][j] = ALPHABET[((size) * i) + j];
            }
        }
    }

    public void rotate90CW() {
        for (int j = 0; j < (size / 2); j++) {
            //int j = 0; //shell depth
            for (int i = j; i < ((size-j) - 1); i++) { //every loop rotates one 'peel' , like next layer of onion.
                int max_idx = size - 1;
                char temp = data[j][i]; //store A
                data[j][i] = data[max_idx - i][j]; //move M on A place
                data[max_idx - i][j] = data[max_idx - j][max_idx - i];// move P on M place
                data[max_idx - j][max_idx - i] = data[i][max_idx - j];//move D on P place
                data[i][max_idx - j] = temp;//move A on D place
            }
        }
    }

    public void rotate90CCW() {
        for (int j = 0; j < (size / 2); j++) {
            //int j = 0; //shell depth
            for (int i = j; i < ((size-j) - 1); i++) { //every loop rotates one 'peel' , like next layer of onion.
                int max_idx = size - 1;
                char temp = data[j][i]; //store A
                data[j][i] = data[i][max_idx-j]; //move D on A place
                data[i][max_idx-j] = data[max_idx - j][max_idx - i];// move P on D place
                data[max_idx - j][max_idx-i] = data[max_idx-i][j];//move M on P place
                data[max_idx-i][j] = temp;//move A on M place
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sbld = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sbld.append(data[i]);
            if ((i + 1) < size)
                sbld.append(",");
        }
        return sbld.toString();
    }

    public char[] getRow(int rowNo) {
        return data[rowNo];
    }

    public void prettyPrint() {
        for (int i = 0; i < size; i++) {
            System.out.println(new String(getRow(i)));
        }
    }
}
