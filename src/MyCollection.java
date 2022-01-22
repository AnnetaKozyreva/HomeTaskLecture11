import java.util.*;

public class MyCollection {
    public static void main(String[] args) throws Exception {
// LIST
        System.out.println("----------------------------------------------------------");
        try {
            ArrayList<String> orchid = new ArrayList<>();
            System.out.println(orchid.isEmpty());
            orchid.add("Sunny");
            orchid.add("Miki");
            orchid.add("Pinyf");
            orchid.add(0, "Malmo");

            System.out.println("Orchid names are : " + orchid);
            System.out.println("Second name is : [" + orchid.get(1) + "]");
            int index = orchid.indexOf("Malmo");
            System.out.println (orchid.get(index) + " listed under number " + index);
            System.out.println("Total quantity of the orchid names : " + orchid.lastIndexOf("Pinyf"));
            System.out.println("Let`s remove : [" + orchid.remove(1) + "]");
            System.out.println("Let`s replace : [" + orchid.set(1, "Selly") + "]");

            boolean b = Collections.addAll(orchid, "Milly", "Choko", "Nino");
            System.out.println("We've just added a lot of new names : "+b);
            System.out.println("Orchid names after all : " + orchid);

            String[] array = orchid.toArray(new String[0]);
            System.out.println(array.length);
        } catch (NullPointerException e) {
            System.out.println("Wrong using methods");
        }
        System.out.println("----------------------------------------------------------");
// SET
        try {
            Set<String> shopList = new HashSet<>();
            System.out.println(shopList.isEmpty());
            shopList.add("onion");
            shopList.add("cucumber");
            shopList.add("eggs");

            System.out.println("Here is my Shopping List today : " + shopList);
            System.out.println("List contains tomatoes ? - " + shopList.contains("tomatoes"));

            Set<String> pharmacy = new HashSet<>();
            pharmacy.add("aspirin");
            pharmacy.add("sedative");
            System.out.println("I need to add some drugs : " + shopList.addAll(pharmacy));
            shopList.containsAll(pharmacy);
            System.out.println("Check our Shopping List :" + shopList);

            pharmacy.addAll(shopList);
            System.out.println("Let`s remove eggs - " + shopList.remove("eggs"));
            shopList.retainAll(pharmacy);
            System.out.println("Shopping List after invoking retainAll() method:\n" + shopList);

            System.out.println("The hashcode value of the set: " + shopList.hashCode());
            System.out.println("Equality of shopList and pharmacy : " + shopList.equals(pharmacy));
            System.out.println("Iterating over list:");
            Iterator<String> i = shopList.iterator();
            while (i.hasNext())
                System.out.print(i.next() + " , ");
            String[] array = shopList.toArray(new String[0]);
            System.out.println( array.length);
            shopList.removeAll(shopList);
            System.out.println("Is anything left in my shopping list? :" + shopList.size());
        }catch (NullPointerException e) {
            System.out.println("Wrong using methods");
        }
        System.out.println("----------------------------------------------------------");
// QUEUE
        try {
            Queue<Integer> funnyNum = new LinkedList<>();
            for (int i = 0; i < 5; i++)
                funnyNum.add(i);
            System.out.println("Elements of queue :" + funnyNum);
            System.out.println("The 1st element is : " + funnyNum.element());
            System.out.println("Let`s insert [1] in the end of the queue : " + funnyNum.offer(1));
            for(int i: funnyNum)
                System.out.print( i + " ");
            System.out.println("\nLet`s remove [2] from the queue : " + funnyNum.remove(2));
            System.out.println("What we have " + funnyNum);
            System.out.println("Let`s remove one more from the queue : " + funnyNum.poll());
            System.out.println("What we have  " + funnyNum);
            System.out.println("Now the 1st element is : " + funnyNum.peek());
        }catch (NullPointerException e) {
            System.out.println("Wrong using methods");
        }
        System.out.println("----------------------------------------------------------");
// MAP
        try {
            Map<String, String> books = new HashMap<>();

            books.put("The Little Prince", "1943");
            books.put("Winnie-the-Pooh", "1926");
            books.put("Harry Potter and the Philosopher's Stone", "1997");

            Set<Map.Entry<String,String>> set = books.entrySet();
            for (Map.Entry<String,String> me : set){
                System.out.println(me.getKey());
                System.out.println(me.getValue());
            }
            System.out.println("How many books? - " + books.size());
            System.out.println("Let`s remove one book : " + books.remove("Harry Potter and the Philosopher's Stone", "1997"));
            boolean exists = (books.containsKey("Harry Potter and the Philosopher's Stone"));
            System.out.println("Does Harry Potter exist? - " + exists);
            exists = (books.containsValue("1926"));
            System.out.println("Does book of the 1926 exist? - " + exists);
            System.out.println("I have already read all the books");
            books.clear();
            System.out.println("Is there nothing left? - " + books.isEmpty());

            System.out.println("----------------------------------------------------------");
        }catch (NullPointerException e) {
            System.out.println("Wrong using methods");
        }
    }
}