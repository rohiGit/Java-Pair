class Pair<T extends Comparable<T>, S extends Comparable<S>> implements Comparable<Pair<T,S>>{
        T first;
        S second;
        public Pair(T x, S y){
            first = x;
            second = y;
        }
        public int compareTo(Pair<T, S> o) {
            int cmp = compare(first, o.first);
            return cmp == 0 ? compare(second, o.second) : cmp;
        }
        public String toString() {
            return "(" + first + ", " + second + ')';
        }
        private <T extends Comparable<T>> int compare(T o1, T o2) {
            if(o1 == null) {
                if(o2 == null) {
                    return 0;
                } else {
                    return -1;
                }
            } else if(o2 == null) {
                return +1;
            } else {
                return o1.compareTo(o2);
            }
        }
    }