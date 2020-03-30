
	import java.util.*;
class Card2 implements Comparable<Card2> {
		private char symbol;
		private int number;
		
		public Card2() {}
		
		public Card2(char symbol, int number) {
			super();
			this.symbol = symbol;
			this.number = number;
		}

		public char getSymbol() {
			return symbol;
		}

		public void setSymbol(char symbol) {
			this.symbol = symbol;
		}

		public int getNumber() {
			return number;
		}

		public void setNumber(int number) {
			this.number = number;
		}

		@Override
		public String toString() {
			return "Card [symbol=" + symbol + ", number=" + number + "]";
		}

		@Override
		public int compareTo(Card2 o) {
			if (this.symbol < o.symbol) return -1;
			else if (this.symbol > o.symbol) return 1;
			else return 1;
		}
}
public class CollectCardGroup {


		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			Map<Character, ArrayList<Card2>> map = new TreeMap<>();
			
			System.out.println("Enter Number of Cards :");
			int n = sc.nextInt();
			sc.nextLine();
			
			for (int i = 1; i <= n; i++) {
				System.out.println("Enter card " + n);
				char symbol = sc.nextLine().charAt(0);
				int number = sc.nextInt();
				
				Card2 card = new Card2();
				card.setSymbol(symbol);
				card.setNumber(number);
				sc.nextLine();
				
				if (!map.containsKey(symbol)) {
					ArrayList<Card2> list = new ArrayList<>();
					list.add(card);
					map.put(symbol, list);
				} else {
					ArrayList<Card2> list = map.get(symbol);
					list.add(card);
				}			
			}
			System.out.println("Distinct Symbols are :");
			
			Set<Map.Entry<Character, ArrayList<Card2>>> set = map.entrySet();
			Iterator<Map.Entry<Character, ArrayList<Card2>>> it = set.iterator();
			while (it.hasNext()) {
				System.out.print(it.next().getKey() + " ");
			}
			System.out.println();
			
			
			set = map.entrySet();
			it = set.iterator();
			
			while (it.hasNext()) {
				int sum = 0;
				Map.Entry<Character, ArrayList<Card2>> me = it.next();
				ArrayList<Card2> list = me.getValue();
				
				System.out.println("Cards in " + me.getKey() + " Symbol");
				
				for (Card2 card : list) {
					System.out.println(card.getSymbol() + " " + card.getNumber());
					sum += card.getNumber();
				}
				
				System.out.println("Number of cards : " + list.size());
				System.out.println("Sum of Numbers : " + sum);
			}			
			
			sc.close();
		}

	}

