package org.apache.commons.codec.language;

import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringEncoder;

@Deprecated
public class RefinedSoundex implements StringEncoder {
    public static final RefinedSoundex US_ENGLISH = new RefinedSoundex();
    public static final char[] US_ENGLISH_MAPPING = "01360240043788015936020505".toCharArray();
    private char[] soundexMapping;

    public RefinedSoundex() {
        this(US_ENGLISH_MAPPING);
    }

    public int difference(String str, String str2) throws EncoderException {
        return SoundexUtils.difference(this, str, str2);
    }

    public Object encode(Object obj) throws EncoderException {
        if (obj instanceof String) {
            return soundex((String) obj);
        }
        throw new EncoderException("Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
    }

    public char getMappingCode(char c) {
        if (!Character.isLetter(c)) {
            return 0;
        }
        return this.soundexMapping[Character.toUpperCase(c) - 'A'];
    }

    public String soundex(String str) {
        if (str == null) {
            return null;
        }
        String clean = SoundexUtils.clean(str);
        if (clean.length() == 0) {
            return clean;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(clean.charAt(0));
        char c = '*';
        for (int i = 0; i < clean.length(); i++) {
            char mappingCode = getMappingCode(clean.charAt(i));
            if (mappingCode != c) {
                if (mappingCode != 0) {
                    stringBuffer.append(mappingCode);
                }
                c = mappingCode;
            }
        }
        return stringBuffer.toString();
    }

    public RefinedSoundex(char[] cArr) {
        this.soundexMapping = cArr;
    }

    public String encode(String str) {
        return soundex(str);
    }
}
