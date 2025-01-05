
import java.util.ArrayList;
import java.util.Arrays;

public class BlockchianProgram {
    public static void main(String[] args) {

        //demonstrate a hash function
        String statement1 = "My world is perfect";
        int hashValue = statement1.hashCode();
        System.out.println("Statement = "+statement1 + " whose hash value = " + hashValue);


        //let's hash an array
        String [] list1 = {"alex", "becky", "cyril"};
        String [] list2 = {"alex", "becky", "Cyril"};

        int hash1 = Arrays.hashCode(list1);
        int hash2 = Arrays.hashCode(list2);

        System.out.println("Hash1 = " + hash1 + " Hash2 = " + hash2);


        //demonstrate a series of blocks in a chain
        ArrayList<Block> blockchain = new ArrayList<Block>();

        //1st block
        String[] initialValues = {"Shad has $700", "Miguel has $550"};
        Block firstBlock = new Block(initialValues,0);
        blockchain.add(firstBlock);
        System.out.println("First block is = " + firstBlock.toString());
        System.out.println("The blockchain is" + blockchain.toString());
        //BlockHash=1645480768

        //2nd block
        String[] shadGivesItAway = {"Shad gives Tim $400", "Shad gives Tany $60", "Shad gives Terry $100"};
        Block secondBlock = new Block(shadGivesItAway, firstBlock.getBlockHash());
        blockchain.add(secondBlock);
        System.out.println("second Block is = " + secondBlock.toString());
        System.out.println("The blockchain is" + blockchain.toString());
        //blockHash=630749953

        //3rd block
        String[] shadGetsSomeBack = {"Tim gives Shad $10" , "Terry gives $50 to Shad"};
        Block thirdBlock = new Block(shadGetsSomeBack, secondBlock.getBlockHash());
        blockchain.add(thirdBlock);
        System.out.println("third Block  is = " + thirdBlock.toString());
        System.out.println("The blockchain is" + blockchain.toString());
        //blockHash=-502240548

    }

}