package defpackage;

import java.io.Closeable;
import java.math.BigInteger;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.util.LangUtils;
import org.msgpack.core.MessageInsufficientBufferException;
import org.msgpack.core.MessageIntegerOverflowException;
import org.msgpack.core.MessagePackException;
import org.msgpack.core.buffer.ArrayBufferInput;
import org.msgpack.core.buffer.MessageBuffer;
import org.msgpack.core.buffer.MessageBufferInput;
import org.webrtc.PeerConnectionFactory;
import ru.ok.tamtam.nano.Protos;

/* renamed from: ws8  reason: default package */
public final class ws8 implements Closeable {
    public static final MessageBuffer D0 = MessageBuffer.wrap(new byte[0]);
    public StringBuilder A0;
    public CharsetDecoder B0;
    public CharBuffer C0;
    public final int X;
    public final int Y;
    public final MessageBufferInput Z;
    public final boolean a;
    public final boolean b;
    public final CodingErrorAction c;
    public final CodingErrorAction o;
    public MessageBuffer w0 = D0;
    public int x0;
    public final MessageBuffer y0 = MessageBuffer.allocate(8);
    public int z0;

    public ws8(ArrayBufferInput arrayBufferInput, kr8 kr8) {
        this.Z = arrayBufferInput;
        this.a = kr8.a;
        this.b = kr8.b;
        this.c = kr8.c;
        this.o = kr8.o;
        this.X = kr8.X;
        this.Y = kr8.Z;
    }

    public static MessageIntegerOverflowException U(int i) {
        return new MessageIntegerOverflowException(BigInteger.valueOf(((long) (i & Integer.MAX_VALUE)) + 2147483648L));
    }

    public static MessageIntegerOverflowException e0(long j) {
        return new MessageIntegerOverflowException(BigInteger.valueOf(j - Long.MIN_VALUE).setBit(63));
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [java.lang.RuntimeException, org.msgpack.core.MessagePackException] */
    /* JADX WARNING: type inference failed for: r5v3, types: [java.lang.RuntimeException, org.msgpack.core.MessagePackException] */
    public static MessagePackException r0(String str, byte b2) {
        sp8 sp8 = sp8.a1[b2 & 255];
        if (sp8 == sp8.NEVER_USED) {
            return new RuntimeException(wn6.i("Expected ", str, ", but encountered 0xC1 \"NEVER_USED\" byte"));
        }
        String r = sxe.r(sp8.a());
        return new RuntimeException(String.format("Expected %s, but got %s (%02x)", new Object[]{str, r.substring(0, 1) + r.substring(1).toLowerCase(), Byte.valueOf(b2)}));
    }

    public final n1 A0() {
        BigInteger bigInteger;
        double d;
        s55 s55;
        s55 s552;
        sp8 n = n();
        int i = 0;
        switch (hr1.t(n.a())) {
            case 0:
                readByte();
                return dt6.a;
            case 1:
                return u0() ? ks6.b : ks6.c;
            case 2:
                if (n != sp8.UINT64) {
                    return new xs6(w0());
                }
                byte readByte = readByte();
                if (ete.M(readByte)) {
                    bigInteger = BigInteger.valueOf((long) readByte);
                } else {
                    switch (readByte) {
                        case -52:
                            bigInteger = BigInteger.valueOf((long) (readByte() & 255));
                            break;
                        case -51:
                            bigInteger = BigInteger.valueOf((long) (readShort() & 65535));
                            break;
                        case -50:
                            int readInt = readInt();
                            if (readInt >= 0) {
                                bigInteger = BigInteger.valueOf((long) readInt);
                                break;
                            } else {
                                bigInteger = BigInteger.valueOf(((long) (readInt & Integer.MAX_VALUE)) + 2147483648L);
                                break;
                            }
                        case -49:
                            long readLong = readLong();
                            if (readLong >= 0) {
                                bigInteger = BigInteger.valueOf(readLong);
                                break;
                            } else {
                                bigInteger = BigInteger.valueOf(readLong - Long.MIN_VALUE).setBit(63);
                                break;
                            }
                        case -48:
                            bigInteger = BigInteger.valueOf((long) readByte());
                            break;
                        case -47:
                            bigInteger = BigInteger.valueOf((long) readShort());
                            break;
                        case -46:
                            bigInteger = BigInteger.valueOf((long) readInt());
                            break;
                        case -45:
                            bigInteger = BigInteger.valueOf(readLong());
                            break;
                        default:
                            throw r0("Integer", readByte);
                    }
                }
                return new hs6(bigInteger);
            case 3:
                byte readByte2 = readByte();
                if (readByte2 == -54) {
                    d = (double) m0(4).getFloat(this.z0);
                } else if (readByte2 == -53) {
                    d = m0(8).getDouble(this.z0);
                } else {
                    throw r0("Float", readByte2);
                }
                return new os6(d);
            case 4:
                return new m1(p0(y0()));
            case 5:
                return new m1(p0(t0()));
            case 6:
                int s0 = s0();
                uze[] uzeArr = new uze[s0];
                while (i < s0) {
                    uzeArr[i] = A0();
                    i++;
                }
                return s0 == 0 ? es6.b : new es6(uzeArr);
            case 7:
                int x02 = x0() * 2;
                uze[] uzeArr2 = new uze[x02];
                while (i < x02) {
                    uzeArr2[i] = A0();
                    uzeArr2[i + 1] = A0();
                    i += 2;
                }
                return x02 == 0 ? ct6.b : new ct6(uzeArr2);
            case 8:
                byte readByte3 = readByte();
                switch (readByte3) {
                    case -57:
                        MessageBuffer m0 = m0(2);
                        s55 = new s55(m0.getByte(this.z0) & 255, m0.getByte(this.z0 + 1));
                        break;
                    case -56:
                        MessageBuffer m02 = m0(3);
                        s552 = new s55(m02.getShort(this.z0) & 65535, m02.getByte(this.z0 + 2));
                        break;
                    case -55:
                        MessageBuffer m03 = m0(5);
                        int i2 = m03.getInt(this.z0);
                        if (i2 >= 0) {
                            s552 = new s55(i2, m03.getByte(this.z0 + 4));
                            break;
                        } else {
                            throw new MessagePackException();
                        }
                    default:
                        switch (readByte3) {
                            case -44:
                                s552 = new s55(1, readByte());
                                break;
                            case -43:
                                s55 = new s55(2, readByte());
                                break;
                            case -42:
                                s55 = new s55(4, readByte());
                                break;
                            case -41:
                                s55 = new s55(8, readByte());
                                break;
                            case -40:
                                s55 = new s55(16, readByte());
                                break;
                            default:
                                throw r0("Ext", readByte3);
                        }
                }
                s55 = s552;
                return new qs6(s55.a, p0(s55.b));
            default:
                throw new RuntimeException("Unknown value type");
        }
    }

    public final void S() {
        MessageBuffer next = this.Z.next();
        if (next != null) {
            this.w0.size();
            this.w0 = next;
            this.x0 = 0;
            return;
        }
        throw new MessageInsufficientBufferException();
    }

    public final String a(int i) {
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        if (this.c == codingErrorAction && this.o == codingErrorAction && this.w0.hasArray()) {
            String str = new String(this.w0.array(), this.w0.arrayOffset() + this.x0, i, lr8.a);
            this.x0 += i;
            return str;
        }
        try {
            CharBuffer decode = this.B0.decode(this.w0.sliceAsByteBuffer(this.x0, i));
            this.x0 += i;
            return decode.toString();
        } catch (CharacterCodingException e) {
            throw new RuntimeException(e);
        }
    }

    public final void close() {
        this.w0 = D0;
        this.x0 = 0;
        this.Z.close();
    }

    public final boolean m() {
        while (this.w0.size() <= this.x0) {
            MessageBuffer next = this.Z.next();
            if (next == null) {
                return false;
            }
            this.w0.size();
            this.w0 = next;
            this.x0 = 0;
        }
        return true;
    }

    public final MessageBuffer m0(int i) {
        int size = this.w0.size();
        int i2 = this.x0;
        int i3 = size - i2;
        if (i3 >= i) {
            this.z0 = i2;
            this.x0 = i2 + i;
            return this.w0;
        }
        MessageBuffer messageBuffer = this.y0;
        if (i3 > 0) {
            messageBuffer.putMessageBuffer(0, this.w0, i2, i3);
            i -= i3;
        } else {
            i3 = 0;
        }
        while (true) {
            S();
            int size2 = this.w0.size();
            if (size2 >= i) {
                messageBuffer.putMessageBuffer(i3, this.w0, 0, i);
                this.x0 = i;
                this.z0 = 0;
                return messageBuffer;
            }
            messageBuffer.putMessageBuffer(i3, this.w0, 0, size2);
            i -= size2;
            i3 += size2;
        }
    }

    public final sp8 n() {
        if (m()) {
            return sp8.a1[this.w0.getByte(this.x0) & 255];
        }
        throw new MessageInsufficientBufferException();
    }

    public final int n0() {
        return readShort() & 65535;
    }

    public final void o(CoderResult coderResult) {
        if ((coderResult.isMalformed() && this.c == CodingErrorAction.REPORT) || (coderResult.isUnmappable() && this.o == CodingErrorAction.REPORT)) {
            coderResult.throwException();
        }
    }

    public final int o0() {
        int readInt = readInt();
        if (readInt >= 0) {
            return readInt;
        }
        throw new MessagePackException();
    }

    public final byte[] p0(int i) {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (true) {
            int size = this.w0.size();
            int i3 = this.x0;
            int i4 = size - i3;
            if (i4 >= i) {
                this.w0.getBytes(i3, bArr, i2, i);
                this.x0 += i;
                return bArr;
            }
            this.w0.getBytes(i3, bArr, i2, i4);
            i2 += i4;
            i -= i4;
            this.x0 += i4;
            S();
        }
    }

    public final void q0(int i) {
        while (true) {
            int size = this.w0.size();
            int i2 = this.x0;
            int i3 = size - i2;
            if (i3 >= i) {
                this.x0 = i2 + i;
                return;
            }
            this.x0 = i2 + i3;
            i -= i3;
            S();
        }
    }

    public final byte readByte() {
        int size = this.w0.size();
        int i = this.x0;
        if (size > i) {
            byte b2 = this.w0.getByte(i);
            this.x0++;
            return b2;
        }
        S();
        if (this.w0.size() <= 0) {
            return readByte();
        }
        byte b3 = this.w0.getByte(0);
        this.x0 = 1;
        return b3;
    }

    public final int readInt() {
        return m0(4).getInt(this.z0);
    }

    public final long readLong() {
        return m0(8).getLong(this.z0);
    }

    public final short readShort() {
        return m0(2).getShort(this.z0);
    }

    public final int s0() {
        byte readByte = readByte();
        if ((readByte & -16) == -112) {
            return readByte & 15;
        }
        if (readByte == -36) {
            return n0();
        }
        if (readByte == -35) {
            return o0();
        }
        throw r0("Array", readByte);
    }

    public final int t0() {
        int i;
        byte readByte = readByte();
        if ((readByte & -32) == -96) {
            return readByte & 31;
        }
        int i2 = -1;
        switch (readByte) {
            case -60:
                i = readByte() & 255;
                break;
            case -59:
                i = n0();
                break;
            case -58:
                i = o0();
                break;
            default:
                i = -1;
                break;
        }
        if (i >= 0) {
            return i;
        }
        if (this.a) {
            switch (readByte) {
                case -39:
                    i2 = readByte() & 255;
                    break;
                case -38:
                    i2 = n0();
                    break;
                case -37:
                    i2 = o0();
                    break;
            }
            if (i2 >= 0) {
                return i2;
            }
        }
        throw r0("Binary", readByte);
    }

    public final boolean u0() {
        byte readByte = readByte();
        if (readByte == -62) {
            return false;
        }
        if (readByte == -61) {
            return true;
        }
        throw r0("boolean", readByte);
    }

    public final int v0() {
        byte readByte = readByte();
        if (ete.M(readByte)) {
            return readByte;
        }
        switch (readByte) {
            case -52:
                return readByte() & 255;
            case -51:
                return readShort() & 65535;
            case -50:
                int readInt = readInt();
                if (readInt >= 0) {
                    return readInt;
                }
                throw U(readInt);
            case -49:
                long readLong = readLong();
                if (readLong >= 0 && readLong <= 2147483647L) {
                    return (int) readLong;
                }
                throw e0(readLong);
            case -48:
                return readByte();
            case -47:
                return readShort();
            case -46:
                return readInt();
            case -45:
                long readLong2 = readLong();
                if (readLong2 >= -2147483648L && readLong2 <= 2147483647L) {
                    return (int) readLong2;
                }
                throw new MessageIntegerOverflowException(BigInteger.valueOf(readLong2));
            default:
                throw r0("Integer", readByte);
        }
    }

    public final long w0() {
        byte readByte = readByte();
        if (ete.M(readByte)) {
            return (long) readByte;
        }
        switch (readByte) {
            case -52:
                return (long) (readByte() & 255);
            case -51:
                return (long) (readShort() & 65535);
            case -50:
                int readInt = readInt();
                return readInt < 0 ? ((long) (readInt & Integer.MAX_VALUE)) + 2147483648L : (long) readInt;
            case -49:
                long readLong = readLong();
                if (readLong >= 0) {
                    return readLong;
                }
                throw e0(readLong);
            case -48:
                return (long) readByte();
            case -47:
                return (long) readShort();
            case -46:
                return (long) readInt();
            case -45:
                return readLong();
            default:
                throw r0("Integer", readByte);
        }
    }

    public final int x0() {
        byte readByte = readByte();
        if ((readByte & -16) == Byte.MIN_VALUE) {
            return readByte & 15;
        }
        if (readByte == -34) {
            return n0();
        }
        if (readByte == -33) {
            return o0();
        }
        throw r0("Map", readByte);
    }

    public final int y0() {
        int i;
        byte readByte = readByte();
        if ((readByte & -32) == -96) {
            return readByte & 31;
        }
        int i2 = -1;
        switch (readByte) {
            case -39:
                i = readByte() & 255;
                break;
            case -38:
                i = n0();
                break;
            case -37:
                i = o0();
                break;
            default:
                i = -1;
                break;
        }
        if (i >= 0) {
            return i;
        }
        if (this.b) {
            switch (readByte) {
                case -60:
                    i2 = readByte() & 255;
                    break;
                case -59:
                    i2 = n0();
                    break;
                case -58:
                    i2 = o0();
                    break;
            }
            if (i2 >= 0) {
                return i2;
            }
        }
        throw r0("String", readByte);
    }

    public final void z() {
        int i;
        int n0;
        int i2 = 1;
        while (i2 > 0) {
            byte readByte = readByte();
            switch (sp8.a1[readByte & 255].ordinal()) {
                case 1:
                    i = readByte & 15;
                    break;
                case 2:
                    i2 += readByte & 15;
                    continue;
                case 3:
                    q0(readByte & 31);
                    continue;
                case 5:
                    throw new RuntimeException("Encountered 0xC1 \"NEVER_USED\" byte");
                case 7:
                case 28:
                    q0(readByte() & 255);
                    continue;
                case 8:
                case 29:
                    q0(n0());
                    continue;
                case 9:
                case 30:
                    q0(o0());
                    continue;
                case 10:
                    q0((readByte() & 255) + 1);
                    continue;
                case 11:
                    q0(n0() + 1);
                    continue;
                case Protos.Attaches.Attach.PRESENT:
                    q0(o0() + 1);
                    continue;
                case 13:
                case LangUtils.HASH_SEED:
                case 21:
                    q0(4);
                    continue;
                case Protos.Attaches.Attach.LOCATION:
                case 18:
                case 22:
                    q0(8);
                    continue;
                case Protos.Attaches.Attach.DAILY_MEDIA:
                case 19:
                    q0(1);
                    continue;
                case PeerConnectionFactory.Options.ADAPTER_TYPE_LOOPBACK:
                case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS:
                    q0(2);
                    continue;
                case 23:
                    q0(2);
                    continue;
                case 24:
                    q0(3);
                    continue;
                case 25:
                    q0(5);
                    continue;
                case 26:
                    q0(9);
                    continue;
                case 27:
                    q0(17);
                    continue;
                case 31:
                    n0 = n0();
                    break;
                case 32:
                    n0 = o0();
                    break;
                case 33:
                    i = n0();
                    break;
                case 34:
                    i = o0();
                    break;
            }
            n0 = i * 2;
            i2 += n0;
            i2--;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        r4.throwException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0134, code lost:
        throw new java.lang.RuntimeException("Unexpected UTF-8 multibyte sequence");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String z0() {
        /*
            r8 = this;
            java.lang.String r0 = "Unexpected UTF-8 multibyte sequence"
            int r1 = r8.y0()
            if (r1 != 0) goto L_0x000b
            java.lang.String r8 = ""
            return r8
        L_0x000b:
            int r2 = r8.X
            if (r1 > r2) goto L_0x015b
            java.nio.charset.CharsetDecoder r2 = r8.B0
            if (r2 != 0) goto L_0x0030
            int r2 = r8.Y
            java.nio.CharBuffer r2 = java.nio.CharBuffer.allocate(r2)
            r8.C0 = r2
            java.nio.charset.Charset r2 = defpackage.lr8.a
            java.nio.charset.CharsetDecoder r2 = r2.newDecoder()
            java.nio.charset.CodingErrorAction r3 = r8.c
            java.nio.charset.CharsetDecoder r2 = r2.onMalformedInput(r3)
            java.nio.charset.CodingErrorAction r3 = r8.o
            java.nio.charset.CharsetDecoder r2 = r2.onUnmappableCharacter(r3)
            r8.B0 = r2
            goto L_0x0033
        L_0x0030:
            r2.reset()
        L_0x0033:
            java.lang.StringBuilder r2 = r8.A0
            r3 = 0
            if (r2 != 0) goto L_0x0040
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r8.A0 = r2
            goto L_0x0043
        L_0x0040:
            r2.setLength(r3)
        L_0x0043:
            org.msgpack.core.buffer.MessageBuffer r2 = r8.w0
            int r2 = r2.size()
            int r4 = r8.x0
            int r2 = r2 - r4
            if (r2 < r1) goto L_0x0053
            java.lang.String r8 = r8.a(r1)
            return r8
        L_0x0053:
            if (r1 <= 0) goto L_0x014e
            org.msgpack.core.buffer.MessageBuffer r2 = r8.w0     // Catch:{ CharacterCodingException -> 0x006b }
            int r2 = r2.size()     // Catch:{ CharacterCodingException -> 0x006b }
            int r4 = r8.x0     // Catch:{ CharacterCodingException -> 0x006b }
            int r2 = r2 - r4
            if (r2 < r1) goto L_0x006e
            java.lang.StringBuilder r0 = r8.A0     // Catch:{ CharacterCodingException -> 0x006b }
            java.lang.String r1 = r8.a(r1)     // Catch:{ CharacterCodingException -> 0x006b }
            r0.append(r1)     // Catch:{ CharacterCodingException -> 0x006b }
            goto L_0x014e
        L_0x006b:
            r8 = move-exception
            goto L_0x0155
        L_0x006e:
            if (r2 != 0) goto L_0x0074
            r8.S()     // Catch:{ CharacterCodingException -> 0x006b }
            goto L_0x0053
        L_0x0074:
            org.msgpack.core.buffer.MessageBuffer r5 = r8.w0     // Catch:{ CharacterCodingException -> 0x006b }
            java.nio.ByteBuffer r4 = r5.sliceAsByteBuffer(r4, r2)     // Catch:{ CharacterCodingException -> 0x006b }
            int r5 = r4.position()     // Catch:{ CharacterCodingException -> 0x006b }
            java.nio.CharBuffer r6 = r8.C0     // Catch:{ CharacterCodingException -> 0x006b }
            r6.clear()     // Catch:{ CharacterCodingException -> 0x006b }
            java.nio.charset.CharsetDecoder r6 = r8.B0     // Catch:{ CharacterCodingException -> 0x006b }
            java.nio.CharBuffer r7 = r8.C0     // Catch:{ CharacterCodingException -> 0x006b }
            java.nio.charset.CoderResult r6 = r6.decode(r4, r7, r3)     // Catch:{ CharacterCodingException -> 0x006b }
            int r4 = r4.position()     // Catch:{ CharacterCodingException -> 0x006b }
            int r4 = r4 - r5
            int r5 = r8.x0     // Catch:{ CharacterCodingException -> 0x006b }
            int r5 = r5 + r4
            r8.x0 = r5     // Catch:{ CharacterCodingException -> 0x006b }
            int r1 = r1 - r4
            java.lang.StringBuilder r5 = r8.A0     // Catch:{ CharacterCodingException -> 0x006b }
            java.nio.CharBuffer r7 = r8.C0     // Catch:{ CharacterCodingException -> 0x006b }
            java.nio.Buffer r7 = r7.flip()     // Catch:{ CharacterCodingException -> 0x006b }
            r5.append(r7)     // Catch:{ CharacterCodingException -> 0x006b }
            boolean r5 = r6.isError()     // Catch:{ CharacterCodingException -> 0x006b }
            if (r5 == 0) goto L_0x00aa
            r8.o(r6)     // Catch:{ CharacterCodingException -> 0x006b }
        L_0x00aa:
            boolean r5 = r6.isUnderflow()     // Catch:{ CharacterCodingException -> 0x006b }
            if (r5 == 0) goto L_0x0053
            if (r4 >= r2) goto L_0x0053
            org.msgpack.core.buffer.MessageBuffer r2 = r8.w0     // Catch:{ CharacterCodingException -> 0x006b }
            int r4 = r8.x0     // Catch:{ CharacterCodingException -> 0x006b }
            byte r2 = r2.getByte(r4)     // Catch:{ CharacterCodingException -> 0x006b }
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = ~r2     // Catch:{ CharacterCodingException -> 0x006b }
            int r2 = r2 << 24
            int r2 = java.lang.Integer.numberOfLeadingZeros(r2)     // Catch:{ CharacterCodingException -> 0x006b }
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r2)     // Catch:{ CharacterCodingException -> 0x006b }
            org.msgpack.core.buffer.MessageBuffer r4 = r8.w0     // Catch:{ CharacterCodingException -> 0x006b }
            int r5 = r8.x0     // Catch:{ CharacterCodingException -> 0x006b }
            int r6 = r4.size()     // Catch:{ CharacterCodingException -> 0x006b }
            int r7 = r8.x0     // Catch:{ CharacterCodingException -> 0x006b }
            int r6 = r6 - r7
            r4.getBytes(r5, r6, r2)     // Catch:{ CharacterCodingException -> 0x006b }
        L_0x00d5:
            r8.S()     // Catch:{ CharacterCodingException -> 0x006b }
            int r4 = r2.remaining()     // Catch:{ CharacterCodingException -> 0x006b }
            org.msgpack.core.buffer.MessageBuffer r5 = r8.w0     // Catch:{ CharacterCodingException -> 0x006b }
            int r5 = r5.size()     // Catch:{ CharacterCodingException -> 0x006b }
            if (r5 < r4) goto L_0x013c
            org.msgpack.core.buffer.MessageBuffer r5 = r8.w0     // Catch:{ CharacterCodingException -> 0x006b }
            r5.getBytes(r3, r4, r2)     // Catch:{ CharacterCodingException -> 0x006b }
            r8.x0 = r4     // Catch:{ CharacterCodingException -> 0x006b }
            r2.position(r3)     // Catch:{ CharacterCodingException -> 0x006b }
            java.nio.CharBuffer r4 = r8.C0     // Catch:{ CharacterCodingException -> 0x006b }
            r4.clear()     // Catch:{ CharacterCodingException -> 0x006b }
            java.nio.charset.CharsetDecoder r4 = r8.B0     // Catch:{ CharacterCodingException -> 0x006b }
            java.nio.CharBuffer r5 = r8.C0     // Catch:{ CharacterCodingException -> 0x006b }
            java.nio.charset.CoderResult r4 = r4.decode(r2, r5, r3)     // Catch:{ CharacterCodingException -> 0x006b }
            boolean r5 = r4.isError()     // Catch:{ CharacterCodingException -> 0x006b }
            if (r5 == 0) goto L_0x0104
            r8.o(r4)     // Catch:{ CharacterCodingException -> 0x006b }
        L_0x0104:
            boolean r5 = r4.isOverflow()     // Catch:{ CharacterCodingException -> 0x006b }
            if (r5 != 0) goto L_0x012c
            boolean r5 = r4.isUnderflow()     // Catch:{ CharacterCodingException -> 0x006b }
            if (r5 == 0) goto L_0x011a
            int r5 = r2.position()     // Catch:{ CharacterCodingException -> 0x006b }
            int r6 = r2.limit()     // Catch:{ CharacterCodingException -> 0x006b }
            if (r5 < r6) goto L_0x012c
        L_0x011a:
            int r2 = r2.limit()     // Catch:{ CharacterCodingException -> 0x006b }
            int r1 = r1 - r2
            java.lang.StringBuilder r2 = r8.A0     // Catch:{ CharacterCodingException -> 0x006b }
            java.nio.CharBuffer r4 = r8.C0     // Catch:{ CharacterCodingException -> 0x006b }
            java.nio.Buffer r4 = r4.flip()     // Catch:{ CharacterCodingException -> 0x006b }
            r2.append(r4)     // Catch:{ CharacterCodingException -> 0x006b }
            goto L_0x0053
        L_0x012c:
            r4.throwException()     // Catch:{ Exception -> 0x0135 }
            org.msgpack.core.MessageFormatException r8 = new org.msgpack.core.MessageFormatException     // Catch:{ Exception -> 0x0135 }
            r8.<init>(r0)     // Catch:{ Exception -> 0x0135 }
            throw r8     // Catch:{ Exception -> 0x0135 }
        L_0x0135:
            r8 = move-exception
            org.msgpack.core.MessageFormatException r1 = new org.msgpack.core.MessageFormatException     // Catch:{ CharacterCodingException -> 0x006b }
            r1.<init>(r0, r8)     // Catch:{ CharacterCodingException -> 0x006b }
            throw r1     // Catch:{ CharacterCodingException -> 0x006b }
        L_0x013c:
            org.msgpack.core.buffer.MessageBuffer r4 = r8.w0     // Catch:{ CharacterCodingException -> 0x006b }
            int r5 = r4.size()     // Catch:{ CharacterCodingException -> 0x006b }
            r4.getBytes(r3, r5, r2)     // Catch:{ CharacterCodingException -> 0x006b }
            org.msgpack.core.buffer.MessageBuffer r4 = r8.w0     // Catch:{ CharacterCodingException -> 0x006b }
            int r4 = r4.size()     // Catch:{ CharacterCodingException -> 0x006b }
            r8.x0 = r4     // Catch:{ CharacterCodingException -> 0x006b }
            goto L_0x00d5
        L_0x014e:
            java.lang.StringBuilder r8 = r8.A0     // Catch:{ CharacterCodingException -> 0x006b }
            java.lang.String r8 = r8.toString()     // Catch:{ CharacterCodingException -> 0x006b }
            return r8
        L_0x0155:
            org.msgpack.core.MessageStringCodingException r0 = new org.msgpack.core.MessageStringCodingException
            r0.<init>(r8)
            throw r0
        L_0x015b:
            org.msgpack.core.MessageSizeException r8 = new org.msgpack.core.MessageSizeException
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
            java.lang.String r1 = "cannot unpack a String of size larger than %,d: %,d"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ws8.z0():java.lang.String");
    }
}
