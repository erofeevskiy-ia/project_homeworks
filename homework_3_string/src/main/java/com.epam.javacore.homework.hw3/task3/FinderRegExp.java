package com.epam.javacore.homework.hw3.task3;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FinderRegExp {

    private String textForAnalyze;

    private static final String ENCODE = "windows-1251";
    private static final String PATTERN_PICTURE_FOR_EMPH_SENTENCE = "([A-ZА-Я][^.?!]*?)?(?<!\\\\w)(?i)[Рр]ис(\\.|ун)(ке|ок|)\\s\\d{1,2}(?!\\\\w)[^.?!]*?[.?!]";
    private static final String PATTERN_PICTURE_REF_IN_DIV = "v>.*[Рр]ис(\\.|ун)(ке|ок|)\\s\\d{1,2}.*<";


    public FinderRegExp(String path) {
        try {
            textForAnalyze = readFile(path, ENCODE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String readFile(String path, String encode) throws IOException {
        byte[] encoded = Files.readAllBytes(Paths.get(path));
        return new String(encoded, Charset.forName(encode));
    }

    public String getFileString() {
        return textForAnalyze;
    }

    String findRef() {
        StringBuilder sb = new StringBuilder();
        Pattern p = Pattern.compile(PATTERN_PICTURE_REF_IN_DIV);
        Matcher m = p.matcher(textForAnalyze);
        while (m.find()) {
            sb.append(m.group(0));
            sb.append("\n");
        }
        return sb.toString();
    }

    String findSentence(String analyzingString) {
        Pattern p = Pattern.compile(PATTERN_PICTURE_FOR_EMPH_SENTENCE);
        Matcher m = p.matcher(analyzingString);
        StringBuilder sb = new StringBuilder();
        int count = 0;
        while (m.find()) {
            sb.append("#")
                    .append(Integer.toString(count))
                    .append(")")
                    .append(m.group(0))
                    .append("\n");
            count++;
        }
        return sb.toString();
    }


}
