package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: no6  reason: default package */
public final class no6 extends at7 {
    public static final Pattern D0 = Pattern.compile("(.+?)='(.*?)';", 32);
    public final CharsetDecoder B0 = f22.c.newDecoder();
    public final CharsetDecoder C0 = f22.b.newDecoder();

    public no6() {
        super(17);
    }

    public final a39 m(f39 f39, ByteBuffer byteBuffer) {
        String str;
        CharsetDecoder charsetDecoder = this.C0;
        CharsetDecoder charsetDecoder2 = this.B0;
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
            return new a39(new ro6((String) null, (String) null, bArr));
        }
        Matcher matcher = D0.matcher(str);
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
        return new a39(new ro6(str2, str3, bArr));
    }
}
