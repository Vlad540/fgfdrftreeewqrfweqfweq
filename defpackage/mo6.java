package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: mo6  reason: default package */
public final class mo6 extends xs7 {
    public static final Pattern G = Pattern.compile("(.+?)='(.*?)';", 32);
    public final CharsetDecoder E = f22.c.newDecoder();
    public final CharsetDecoder F = f22.b.newDecoder();

    public final y29 k(e39 e39, ByteBuffer byteBuffer) {
        String str;
        CharsetDecoder charsetDecoder = this.F;
        CharsetDecoder charsetDecoder2 = this.E;
        String str2 = null;
        try {
            str = charsetDecoder2.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                String charBuffer = charsetDecoder.decode(byteBuffer).toString();
                charsetDecoder.reset();
                byteBuffer.rewind();
                str = charBuffer;
            } catch (CharacterCodingException unused2) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                str = null;
            } catch (Throwable th) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                throw th;
            }
        } finally {
            charsetDecoder2.reset();
            byteBuffer.rewind();
        }
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        if (str == null) {
            return new y29(new qo6((String) null, (String) null, bArr));
        }
        Matcher matcher = G.matcher(str);
        String str3 = null;
        for (int i = 0; matcher.find(i); i = matcher.end()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            if (group != null) {
                String A = fja.A(group);
                A.getClass();
                if (A.equals("streamurl")) {
                    str3 = group2;
                } else if (A.equals("streamtitle")) {
                    str2 = group2;
                }
            }
        }
        return new y29(new qo6(str2, str3, bArr));
    }
}
