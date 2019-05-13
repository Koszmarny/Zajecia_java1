public class SUTest {
    public static void main(String[] args) {
        StringBuilder SB = new StringBuilder(" Paweł    robi  programy  ");
        StringBuilder SB2 = new StringBuilder("Dawid nic nie //umie");
        StringBuilder KK = new StringBuilder("komentarz");
        StringBuilder Pal = new StringBuilder("devil lived");
        System.out.println("18/1: "+StringUtils.countDigits("kj7yhgt6"));
        System.out.println("18/2: "+StringUtils.countSmallLetters("kj7yhgt6"));
        System.out.println("18/3: "+StringUtils.countCapitalLetters("kj7Yhgt6H"));
        System.out.println("18/4: "+StringUtils.countNonLettersAndNonDigits("kj7yh#*gt%6"));
        System.out.println("18/5: "+StringUtils.countCharacters("kj7yhgk  kt6", 'k'));
        System.out.println("18/6: "+StringUtils.abbreviation(" Zj7yhgt6 Ryujs  kjhd8 r "));
        System.out.println("18/7: "+StringUtils.reverseString("Mateusz ma Ale"));
        System.out.println("18/8: "+StringUtils.isPalindrome("igor lamal rogi"));
        System.out.println("18/9: "+StringUtils.reverseIndexOf("abecadlo", 6));
        System.out.println("18/10: "+StringUtils.filterByEvenOrOdd("kaiala ata",false, 2));
        System.out.println("18/11: "+StringUtils.countCommonCharactersFromBeginning("xyz", "xyzuv"));
        System.out.println("18/12: "+StringUtils.isTrimmableTo("Ala ma kota", "ma "));
        System.out.println("18/13: "+StringUtils.countOccurrences("Ala ma kota kot ma ma ma", "ma"));
        System.out.println("18/14: "+StringUtils.censorByReplacing("Ala ma kota", "ma"));
        System.out.println("18/15: "+StringUtils.censorByRemoving("ma Ala ma kota", "ma"));
        System.out.println("18/16: "+StringUtils.reverseWords("Ala ma kota"));
        System.out.println("18/17: "+StringUtils.numberOfDigits(10000));
        System.out.println("18/18: "+StringUtils.isDecInteger("142646"));
        System.out.println("18/19: "+StringUtils.isHexInteger("0x5F"));
        System.out.println("18/20: "+StringUtils.isNumber("1,45235"));
        System.out.println("19/1: "+StringUtils.removeUnwantedSpaces(SB));
        System.out.println("19/2: "+StringUtils.distribute(SB));
        System.out.println("19/3: "+StringUtils.removeComment(SB2));
        System.out.println("19/4: "+StringUtils.addComment(SB2, KK));
        System.out.println("19/5: "+StringUtils.isPalindrome(Pal));
        System.out.println("19/6: ");
        System.out.println("20/1: "+StringUtils.distribute("Sylwia mi pomaga"));
        System.out.println("20/2: ");
        System.out.println("21/1: "+StringUtils.abbreviationA("Dawid nic nie umie"));
        System.out.println("21/2: "+StringUtils.countWordsWithAChar("Dawid nicn nie umie", 'n'));
        System.out.println("21/3: "+StringUtils.reverseWordsA("dawid nic nie umie"));
        System.out.println("21/4: "+StringUtils.censorByRemovingA("dawid nic nie umie", "nie"));
        System.out.println("21/6: "+StringUtils.changeCase("DawiD Nic Nie Umie"));

    }
}
