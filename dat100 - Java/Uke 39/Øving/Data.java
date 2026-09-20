public class Data {
    public static void main(String[] args) {
        private int data;
        
        public Data(int d) {
            data = d;
        }
        
        public int getData() {
            return data;
        }
        
        public void setData(int data) {
            this.data = data;
        }
        
        public String toString() {
            return "" + data;
        }
    }
}
