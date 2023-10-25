# AP COMSCI - StringShortnerAlgorithm | Main.java
# Version: 0.0.2
- By: Celvis

## Purpose:

- For my AP COMSCI class
<br />

## FAQ:
- Have latest version of Java
- This program is part of my AP COMSCI class
- Please note: If you are taking this for your usage and the grading doesn't appear right, try removing "import java.io.IOException" and removing "throws IOException"
- Also note: I am not at fault if you get in trouble for using this. I had posted this for people to learn, I left the previous note for those who are incompetent and are using this for their assignment
- Discord: Celvis - If you have any issues, please contact me here.

### How to use:
- cd /AP COMSCI StringShortnerAlgorithm
- javac Main.java

# Languages used:
- Java
<img align="left" alt="" width="26px" src="https://camo.githubusercontent.com/651195b8c66a9dd22316e672992077dbcecea4ca904b45a6681558ebc0ecc517/68747470733a2f2f75706c6f61642e77696b696d656469612e6f72672f77696b6970656469612f656e2f7468756d622f332f33302f4a6176615f70726f6772616d6d696e675f6c616e67756167655f6c6f676f2e7376672f33303070782d4a6176615f70726f6772616d6d696e675f6c616e67756167655f6c6f676f2e7376672e706e67" style="padding-right:10px;" />

<br />
<br />

---

### Changelog:
Changes:
1. Reworked Algorithm 1's logic and implementation. Alg1 logic works properly now. Read below for details ↓↓↓↓↓↓↓↓
2. Before the condition for adding a character to the shortenedMessage1 was based on whether it appeared immediately after the same character, which was the incorrect logic. The new logic checks whether the character appears immediately after the same character and if not, adds it to the shortenedMessage1.
3. I modified the condition for adding a character to shortenedMessage1 to consider whether the character is the first character of a word (i.e., it's preceded by a space or it's the first character of the message) or if it's a vowel. This ensures that only vowels at the start of words or the beginning of the message are retained.
5. The isWordStart variable works correctly now and is based on whether the current character is a space or not.

TODO:
1. Nothing at this current time.
