package org.apache.commons.codec.net;

import java.io.UnsupportedEncodingException;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;

@Deprecated
abstract class RFC1522Codec {
    public String decodeText(String str) throws DecoderException, UnsupportedEncodingException {
        if (str == null) {
            return null;
        }
        if (!str.startsWith("=?") || !str.endsWith("?=")) {
            throw new DecoderException("RFC 1522 violation: malformed encoded content");
        }
        int length = str.length() - 2;
        int indexOf = str.indexOf("?", 2);
        if (indexOf == -1 || indexOf == length) {
            throw new DecoderException("RFC 1522 violation: charset token not found");
        }
        String substring = str.substring(2, indexOf);
        if (!substring.equals("")) {
            int i = indexOf + 1;
            int indexOf2 = str.indexOf("?", i);
            if (indexOf2 == -1 || indexOf2 == length) {
                throw new DecoderException("RFC 1522 violation: encoding token not found");
            }
            String substring2 = str.substring(i, indexOf2);
            if (getEncoding().equalsIgnoreCase(substring2)) {
                int i2 = indexOf2 + 1;
                return new String(doDecoding(str.substring(i2, str.indexOf("?", i2)).getBytes("US-ASCII")), substring);
            }
            throw new DecoderException(wn6.i("This codec cannot decode ", substring2, " encoded content"));
        }
        throw new DecoderException("RFC 1522 violation: charset not specified");
    }

    public abstract byte[] doDecoding(byte[] bArr) throws DecoderException;

    public abstract byte[] doEncoding(byte[] bArr) throws EncoderException;

    public String encodeText(String str, String str2) throws EncoderException, UnsupportedEncodingException {
        if (str == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer("=?");
        stringBuffer.append(str2);
        stringBuffer.append('?');
        stringBuffer.append(getEncoding());
        stringBuffer.append('?');
        stringBuffer.append(new String(doEncoding(str.getBytes(str2)), "US-ASCII"));
        stringBuffer.append("?=");
        return stringBuffer.toString();
    }

    public abstract String getEncoding();
}
