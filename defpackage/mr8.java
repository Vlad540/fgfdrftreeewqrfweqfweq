package defpackage;

import java.io.Closeable;
import java.io.Flushable;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import org.msgpack.core.buffer.MessageBuffer;
import org.msgpack.core.buffer.MessageBufferOutput;
import org.msgpack.core.buffer.OutputStreamBufferOutput;

/* renamed from: mr8  reason: default package */
public final class mr8 implements Closeable, Flushable {
    public static final boolean w0;
    public MessageBuffer X;
    public int Y = 0;
    public CharsetEncoder Z;
    public final int a;
    public final int b;
    public final boolean c;
    public final MessageBufferOutput o;

    static {
        boolean z = false;
        try {
            Class<?> cls = Class.forName("android.os.Build$VERSION");
            int i = cls.getField("SDK_INT").getInt(cls.getConstructor((Class[]) null).newInstance((Object[]) null));
            if (i >= 14 && i < 21) {
                z = true;
            }
        } catch (ClassNotFoundException unused) {
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
        } catch (InstantiationException e3) {
            e3.printStackTrace();
        } catch (InvocationTargetException e4) {
            e4.printStackTrace();
        } catch (NoSuchFieldException e5) {
            e5.printStackTrace();
        }
        w0 = z;
    }

    public mr8(OutputStreamBufferOutput outputStreamBufferOutput, jr8 jr8) {
        this.o = outputStreamBufferOutput;
        this.a = jr8.a;
        this.b = jr8.b;
        this.c = jr8.o;
    }

    public final void S(int i) {
        if (i < 32) {
            m0((byte) (i | -96));
        } else if (this.c && i < 256) {
            n0((byte) -39, (byte) i);
        } else if (i < 65536) {
            q0((byte) -38, (short) i);
        } else {
            o0(i, (byte) -37);
        }
    }

    public final void U(String str) {
        if (str.length() <= 0) {
            S(0);
        } else if (w0 || str.length() < this.a) {
            e0(str);
        } else {
            if (str.length() < 256) {
                d((str.length() * 6) + 3);
                int a2 = a(this.Y + 2, str);
                if (a2 >= 0) {
                    if (this.c && a2 < 256) {
                        MessageBuffer messageBuffer = this.X;
                        int i = this.Y;
                        this.Y = i + 1;
                        messageBuffer.putByte(i, (byte) -39);
                        MessageBuffer messageBuffer2 = this.X;
                        int i2 = this.Y;
                        this.Y = i2 + 1;
                        messageBuffer2.putByte(i2, (byte) a2);
                        this.Y += a2;
                        return;
                    } else if (a2 < 65536) {
                        MessageBuffer messageBuffer3 = this.X;
                        int i3 = this.Y;
                        messageBuffer3.putMessageBuffer(i3 + 3, messageBuffer3, i3 + 2, a2);
                        MessageBuffer messageBuffer4 = this.X;
                        int i4 = this.Y;
                        this.Y = i4 + 1;
                        messageBuffer4.putByte(i4, (byte) -38);
                        this.X.putShort(this.Y, (short) a2);
                        this.Y = this.Y + 2 + a2;
                        return;
                    } else {
                        throw new IllegalArgumentException("Unexpected UTF-8 encoder state");
                    }
                }
            } else if (str.length() < 65536) {
                d((str.length() * 6) + 5);
                int a3 = a(this.Y + 3, str);
                if (a3 >= 0) {
                    if (a3 < 65536) {
                        MessageBuffer messageBuffer5 = this.X;
                        int i5 = this.Y;
                        this.Y = i5 + 1;
                        messageBuffer5.putByte(i5, (byte) -38);
                        this.X.putShort(this.Y, (short) a3);
                        this.Y = this.Y + 2 + a3;
                        return;
                    } else if (((long) a3) < 4294967296L) {
                        MessageBuffer messageBuffer6 = this.X;
                        int i6 = this.Y;
                        messageBuffer6.putMessageBuffer(i6 + 5, messageBuffer6, i6 + 3, a3);
                        MessageBuffer messageBuffer7 = this.X;
                        int i7 = this.Y;
                        this.Y = i7 + 1;
                        messageBuffer7.putByte(i7, (byte) -37);
                        this.X.putInt(this.Y, a3);
                        this.Y = this.Y + 4 + a3;
                        return;
                    } else {
                        throw new IllegalArgumentException("Unexpected UTF-8 encoder state");
                    }
                }
            }
            e0(str);
        }
    }

    public final int a(int i, String str) {
        if (this.Z == null) {
            CharsetEncoder newEncoder = lr8.a.newEncoder();
            CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
            this.Z = newEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        }
        this.Z.reset();
        MessageBuffer messageBuffer = this.X;
        ByteBuffer sliceAsByteBuffer = messageBuffer.sliceAsByteBuffer(i, messageBuffer.size() - i);
        int position = sliceAsByteBuffer.position();
        CoderResult encode = this.Z.encode(CharBuffer.wrap(str), sliceAsByteBuffer, true);
        if (encode.isError()) {
            try {
                encode.throwException();
            } catch (CharacterCodingException e) {
                throw new RuntimeException(e);
            }
        }
        if (!encode.isUnderflow() || encode.isOverflow() || !this.Z.flush(sliceAsByteBuffer).isUnderflow()) {
            return -1;
        }
        return sliceAsByteBuffer.position() - position;
    }

    public final void close() {
        MessageBufferOutput messageBufferOutput = this.o;
        try {
            flush();
        } finally {
            messageBufferOutput.close();
        }
    }

    public final void d(int i) {
        MessageBuffer messageBuffer = this.X;
        MessageBufferOutput messageBufferOutput = this.o;
        if (messageBuffer == null) {
            this.X = messageBufferOutput.next(i);
        } else if (this.Y + i >= messageBuffer.size()) {
            this.o.writeBuffer(this.Y);
            this.X = null;
            this.Y = 0;
            this.X = messageBufferOutput.next(i);
        }
    }

    public final void e0(String str) {
        byte[] bytes = str.getBytes(lr8.a);
        S(bytes.length);
        int length = bytes.length;
        MessageBuffer messageBuffer = this.X;
        if (messageBuffer != null) {
            int size = messageBuffer.size();
            int i = this.Y;
            if (size - i >= length && length <= this.b) {
                this.X.putBytes(i, bytes, 0, length);
                this.Y += length;
                return;
            }
        }
        flush();
        this.o.add(bytes, 0, length);
    }

    public final void flush() {
        int i = this.Y;
        if (i > 0) {
            this.o.writeBuffer(i);
            this.X = null;
            this.Y = 0;
        }
        this.o.flush();
    }

    public final void g(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("array size must be >= 0");
        } else if (i < 16) {
            m0((byte) (i | -112));
        } else if (i < 65536) {
            q0((byte) -36, (short) i);
        } else {
            o0(i, (byte) -35);
        }
    }

    public final void m(int i) {
        if (i < -32) {
            if (i < -32768) {
                o0(i, (byte) -46);
            } else if (i < -128) {
                q0((byte) -47, (short) i);
            } else {
                n0((byte) -48, (byte) i);
            }
        } else if (i < 128) {
            m0((byte) i);
        } else if (i < 256) {
            n0((byte) -52, (byte) i);
        } else if (i < 65536) {
            q0((byte) -51, (short) i);
        } else {
            o0(i, (byte) -50);
        }
    }

    public final void m0(byte b2) {
        d(1);
        MessageBuffer messageBuffer = this.X;
        int i = this.Y;
        this.Y = i + 1;
        messageBuffer.putByte(i, b2);
    }

    public final void n(long j) {
        if (j < -32) {
            if (j < -32768) {
                if (j < -2147483648L) {
                    p0(j, (byte) -45);
                } else {
                    o0((int) j, (byte) -46);
                }
            } else if (j < -128) {
                q0((byte) -47, (short) ((int) j));
            } else {
                n0((byte) -48, (byte) ((int) j));
            }
        } else if (j < 128) {
            m0((byte) ((int) j));
        } else if (j < 65536) {
            if (j < 256) {
                n0((byte) -52, (byte) ((int) j));
            } else {
                q0((byte) -51, (short) ((int) j));
            }
        } else if (j < 4294967296L) {
            o0((int) j, (byte) -50);
        } else {
            p0(j, (byte) -49);
        }
    }

    public final void n0(byte b2, byte b3) {
        d(2);
        MessageBuffer messageBuffer = this.X;
        int i = this.Y;
        this.Y = i + 1;
        messageBuffer.putByte(i, b2);
        MessageBuffer messageBuffer2 = this.X;
        int i2 = this.Y;
        this.Y = i2 + 1;
        messageBuffer2.putByte(i2, b3);
    }

    public final void o(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("map size must be >= 0");
        } else if (i < 16) {
            m0((byte) (i | -128));
        } else if (i < 65536) {
            q0((byte) -34, (short) i);
        } else {
            o0(i, (byte) -33);
        }
    }

    public final void o0(int i, byte b2) {
        d(5);
        MessageBuffer messageBuffer = this.X;
        int i2 = this.Y;
        this.Y = i2 + 1;
        messageBuffer.putByte(i2, b2);
        this.X.putInt(this.Y, i);
        this.Y += 4;
    }

    public final void p0(long j, byte b2) {
        d(9);
        MessageBuffer messageBuffer = this.X;
        int i = this.Y;
        this.Y = i + 1;
        messageBuffer.putByte(i, b2);
        this.X.putLong(this.Y, j);
        this.Y += 8;
    }

    public final void q0(byte b2, short s) {
        d(3);
        MessageBuffer messageBuffer = this.X;
        int i = this.Y;
        this.Y = i + 1;
        messageBuffer.putByte(i, b2);
        this.X.putShort(this.Y, s);
        this.Y += 2;
    }
}
