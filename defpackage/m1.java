package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import ru.ok.tamtam.nano.Protos;

/* renamed from: m1  reason: default package */
public abstract class m1 extends n1 implements uze {
    public static final char[] o = "0123456789ABCDEF".toCharArray();
    public final byte[] a;
    public volatile String b;
    public volatile CharacterCodingException c;

    public m1(byte[] bArr) {
        this.a = bArr;
    }

    public static void A(StringBuilder sb, int i) {
        sb.append("\\u");
        char[] cArr = o;
        sb.append(cArr[(i >> 12) & 15]);
        sb.append(cArr[(i >> 8) & 15]);
        sb.append(cArr[(i >> 4) & 15]);
        sb.append(cArr[i & 15]);
    }

    public static void x(StringBuilder sb, String str) {
        sb.append("\"");
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt < ' ') {
                switch (charAt) {
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case Protos.Attaches.Attach.PRESENT /*12*/:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        A(sb, charAt);
                        break;
                }
            } else if (charAt <= 127) {
                if (charAt == '\"') {
                    sb.append("\\\"");
                } else if (charAt != '\\') {
                    sb.append(charAt);
                } else {
                    sb.append("\\\\");
                }
            } else if (charAt < 55296 || charAt > 57343) {
                sb.append(charAt);
            } else {
                A(sb, charAt);
            }
        }
        sb.append("\"");
    }

    public final String a() {
        StringBuilder sb = new StringBuilder();
        x(sb, toString());
        return sb.toString();
    }

    public final String toString() {
        if (this.b == null) {
            z();
        }
        return this.b;
    }

    public final String y() {
        if (this.b == null) {
            z();
        }
        if (this.c == null) {
            return this.b;
        }
        throw new RuntimeException(this.c);
    }

    public final void z() {
        synchronized (this.a) {
            if (this.b == null) {
                try {
                    CharsetDecoder newDecoder = lr8.a.newDecoder();
                    CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
                    this.b = newDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).decode(ByteBuffer.wrap(this.a).asReadOnlyBuffer()).toString();
                } catch (CharacterCodingException e) {
                    throw new RuntimeException(e);
                } catch (CharacterCodingException e2) {
                    CharsetDecoder newDecoder2 = lr8.a.newDecoder();
                    CodingErrorAction codingErrorAction2 = CodingErrorAction.REPLACE;
                    this.b = newDecoder2.onMalformedInput(codingErrorAction2).onUnmappableCharacter(codingErrorAction2).decode(ByteBuffer.wrap(this.a).asReadOnlyBuffer()).toString();
                    this.c = e2;
                }
            }
        }
    }
}
