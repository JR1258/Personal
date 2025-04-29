
public static void repeat(ArrayList<String> list) {

    int k = 2;

    for (int i = 0; i < list.size(); i++) {
        for(k = 0; k < list.size(); k++) {
            list.add(list.get(i));
            }
        }
    }


// UNFINISHED
/*https://www.codestepbystep.com/r/problem/view/java/collections/arraylist/repeat?problemsetid=4327*/
