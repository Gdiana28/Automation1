package com.endava.day5;

import java.io.*;
import java.util.*;

public class WordFrequency {
	public static void main(String[] args) {
		String text = "Once upon a time... in a great castle, a Prince’s daughter grew up happy and contented, in spite "
				+ "of a jealous stepmother. She was very pretty, with blue eyes and long black hair. Her skin was "
				+ "delicate and fair, and so she was called Snow White. Everyone was quite sure she would become "
				+ "very beautiful. Though her stepmother was a wicked woman, she too was very beautiful, and the "
				+ "magic mirror told her this every day, whenever she asked it. ”Mirror, mirror on the wall, who is "
				+ "the loveliest lady in the land?” The reply was always; ”You are, your Majesty,” until the dreadful "
				+ "day when she heard it say, ”Snow White is the loveliest in the land.” The stepmother was furious "
				+ "and, wild with jealousy, began plotting to get rid of her rival. Calling one of her trusty servants, "
				+ "she bribed him with a rich reward to take Snow White into the forest, far away from the Castle. "
				+ "Then, unseen, he was to put her to death. The greedy servant, attracted to the reward, agreed to do "
				+ "this deed, and he led the innocent little girl away. However, when they came to the fatal spot, the "
				+ "man’s courage failed him and, leaving Snow White sitting beside a tree, he mumbled an excuse and ran off. "
				+ "Snow White was all alone in the forest.\n"
				+ "Night came, but the servant did not return. Snow White, alone in the dark forest, began to cry "
				+ "bitterly. She thought she could feel terrible eyes spying on her, and she heard strange sounds and "
				+ "rustlings that made her heart thump. At last, overcome by tiredness, she fell asleep curled under "
				+ "a tree. Snow White slept fitfully, wakening from time to time with a start and staring into the darkness "
				+ "round her. Several times, she thought she felt something, or somebody touch her as she slept. "
				+ "At last, dawn woke the forest to the song of the birds, and Snow White too, awoke. A whole "
				+ "world was stirring to life and the little girl was glad to see how silly her fears had been. However, "
				+ "the thick trees were like a wall round her, and as she tried to find out where she was, she came "
				+ "upon a path. She walked along it, hopefully. On she walked till she came to a clearing. There "
				+ "stood a strange cottage, with a tiny door, tiny windows and a tiny chimney pot. Everything about "
				+ "the cottage was much tinier than it ought to be. Snow White pushed the door open.\n"
				+ "”I wonder who lives here?” she said to herself, peeping round the kitchen. ”What tiny plates! "
				+ "And spoons! There must be seven of them, the table’s laid for seven people.” Upstairs was a "
				+ "bedroom with seven neat little beds. Going back to the kitchen, Snow White had an idea. "
				+ "”I’ll make them something to eat. When they come home, they’ll be glad to find a meal "
				+ "ready.” Towards dusk, seven tiny men marched homewards singing. But when they opened the "
				+ "door, to their surprise they found a bowl of hot steaming soup on the table, and the whole "
				+ "house spick and span. Upstairs was Snow White, fast asleep on one of the beds. The chief dwarf "
				+ "prodded her gently. ”Who are you?” he asked. Snow White told them her sad story, and tears sprang to "
				+ "the dwarfs’ eyes. Then one of them said, as he noisily blew his nose: ”Stay here with us!” "
				+ "”Hooray! Hooray!” they cheered, dancing joyfully round the little girl. "
				+ "The dwarfs said to Snow White: ”You can live here and tend to the house while we’re down the mine. "
				+ "Don’t worry about your stepmother leaving you in the forest. We love you and we’ll take care of you!” "
				+ "Snow White gratefully accepted their hospitality, and next morning the dwarfs set off for work. But "
				+ "they warned Snow White not to open the door to strangers.\n"
				+ "Meanwhile, the servant had returned to the castle, with the heart of a roe deer. He gave it to "
				+ "the cruel stepmother, telling her it belonged to Snow White, so that he could claim the reward. "
				+ "Highly pleased, the stepmother turned again to the magic mirror. But her hopes were dashed, for the "
				+ "mirror replied: ”The loveliest in the land is still Snow White, who lives in the seven dwarfs’ "
				+ "cottage, down in the forest.” The stepmother was beside herself with rage. ”She must die! She must die!” "
				+ "she screamed. Disguising herself as an old peasant woman, she put a poisoned apple with the others in "
				+ "her basket. Then, taking the quickest way into the forest, she crossed the swamp at the edge of the trees. "
				+ "She reached the bank unseen, just as Snow White stood waving goodbye to the seven dwarfs on their way to the mine. "
				+ "Snow White was in the kitchen when she heard the sound at the door: KNOCK! KNOCK! ”Who’s there?” she called "
				+ "suspiciously, remembering the dwarfs advice. ”I’m an old peasant woman selling apples,” came the reply. "
				+ "”I don’t need any apples, thank you,” she replied. ”But they are beautiful apples and ever so juicy!” "
				+ "said the velvety voice from outside the door. ”I’m not supposed to open the door to anyone,” said the "
				+ "little girl, who was reluctant to disobey her friends. ”And quite right too! Good girl! If you promised "
				+ "not to open up to strangers, then of course you can’t buy. You are a good girl indeed!” Then the old woman "
				+ "went on. ”And as a reward for being good, I’m going to make you a gift of one of my apples!” Without a "
				+ "further thought, Snow White opened the door just a tiny crack, to take the apple. ”There! Now isn’t that a nice apple?” "
				+ "Snow White bit into the fruit, and as she did, fell to the ground in a faint: the effect of the terrible poison "
				+ "left her lifeless instantaneously. Now chuckling evilly, the wicked stepmother hurried off. But as she ran back "
				+ "across the swamp, she tripped and fell into the quicksand. No one heard her cries for help, and she disappeared "
				+ "without a trace.\n"
				+ "Meanwhile, the dwarfs came out of the mine to find the sky had grown dark and stormy. Loud thunder echoed through "
				+ "the valleys and streaks of lightning ripped the sky. Worried about Snow White they ran as quickly as they could down "
				+ "the mountain to the cottage. There they found Snow White, lying still and lifeless, the poisoned apple by her side. "
				+ "They did their best to bring her around, but it was no use. They wept and wept for a long time. Then they laid her on "
				+ "a bed of rose petals, carried her into the forest and put her in a crystal coffin. Each day they laid a flower there. "
				+ "Then one evening, they discovered a strange young man admiring Snow White’s lovely face through the glass. After listening "
				+ "to the story, the Prince (for he was a prince!) made a suggestion. ”If you allow me to take her to the Castle, I’ll call in "
				+ "famous doctors to waken her from this peculiar sleep. She’s so lovely... I’d love to kiss her... !” He did, and as though by "
				+ "magic, the Prince’s kiss broke the spell. To everyone’s astonishment, Snow White opened her eyes. She had amazingly come back "
				+ "to life! Now in love, the Prince asked Snow White to marry him, and the dwarfs reluctantly had to say good bye to Snow White. "
				+ "From that day on, Snow White lived happily in a great castle. But from time to time, she was drawn back to visit the little "
				+ "cottage down in the forest";
		String[] words = text.split("\\W+");
		Map<String, Integer> wordCount = new HashMap<>();
		for (String word : words) {
			if (!word.isEmpty()) {
				word = word.toLowerCase();
				wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
			}
		}
		List<Map.Entry<String, Integer>> wordList = new ArrayList<>(wordCount.entrySet());
		wordList.sort((a, b) -> b.getValue().compareTo(a.getValue()));
		for (Map.Entry<String, Integer> entry : wordList) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}
	}
}
