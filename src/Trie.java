import java.util.ArrayList;

public class Trie
{
	private Trie[] children;//26个字母作为字符集 都是小写字母
	private boolean isEnd; //表示该节点是否为字符串的结尾

	public static void main(String[] args)
	{
		Trie trie = new Trie();
		trie.insert("quan");
		ArrayList<Object> objects = new ArrayList<>(3);
	}


	public Trie() {
		children = new Trie[26];
		isEnd = false;
	}

	public void insert(String word) {
		Trie node  = this;
		for(int i=0;i<word.length();i++){
			char ch = word.charAt(i);
			int index = ch-'a';//获取当前字母的索引从0开始开始
			if(node.children[index]==null){
				//防止重复字母
				node.children[index] = new Trie();
			}
			node = node.children[index];
		}
		//最下面一个字母变为true了
		node.isEnd = true;
	}

	public boolean search(String word) {
		Trie node = searchPrefix(word);
		return node !=null && node.isEnd;
	}

	public boolean startsWith(String prefix) {
		return  searchPrefix(prefix)!=null;

	}

	public Trie searchPrefix(String prefix){
		Trie node = this;
		for(int i =0;i<prefix.length();i++){
			char ch = prefix.charAt(i);
			int index = ch-'a';
			if(node.children[index]==null){
				return null;
			}
			node  = node.children[index];
		}
		return node;
	}

}
