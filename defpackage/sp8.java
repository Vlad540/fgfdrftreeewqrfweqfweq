package defpackage;

/* renamed from: sp8  reason: default package */
public enum sp8 {
    POSFIXINT(3),
    FIXMAP(8),
    FIXARRAY(7),
    FIXSTR(5),
    NIL(1),
    NEVER_USED(0),
    BOOLEAN(2),
    BIN8(6),
    BIN16(6),
    BIN32(6),
    EXT8(9),
    EXT16(9),
    EXT32(9),
    FLOAT32(4),
    FLOAT64(4),
    UINT8(3),
    UINT16(3),
    UINT32(3),
    UINT64(3),
    INT8(3),
    INT16(3),
    INT32(3),
    INT64(3),
    FIXEXT1(9),
    FIXEXT2(9),
    FIXEXT4(9),
    FIXEXT8(9),
    FIXEXT16(9),
    STR8(5),
    STR16(5),
    STR32(5),
    ARRAY16(7),
    ARRAY32(7),
    MAP16(8),
    MAP32(8),
    NEGFIXINT(3);
    
    public static final sp8[] a1 = null;
    public final int a;

    static {
        sp8 sp8;
        a1 = new sp8[256];
        for (int i = 0; i <= 255; i++) {
            byte b = (byte) i;
            if ((b & Byte.MIN_VALUE) != 0) {
                byte b2 = b & -32;
                if (b2 != -32) {
                    if (b2 != -96) {
                        byte b3 = b & -16;
                        if (b3 != -112) {
                            if (b3 != Byte.MIN_VALUE) {
                                switch (b) {
                                    case -64:
                                        sp8 = NIL;
                                        break;
                                    case -62:
                                    case -61:
                                        sp8 = BOOLEAN;
                                        break;
                                    case -60:
                                        sp8 = BIN8;
                                        break;
                                    case -59:
                                        sp8 = BIN16;
                                        break;
                                    case -58:
                                        sp8 = BIN32;
                                        break;
                                    case -57:
                                        sp8 = EXT8;
                                        break;
                                    case -56:
                                        sp8 = EXT16;
                                        break;
                                    case -55:
                                        sp8 = EXT32;
                                        break;
                                    case -54:
                                        sp8 = FLOAT32;
                                        break;
                                    case -53:
                                        sp8 = FLOAT64;
                                        break;
                                    case -52:
                                        sp8 = UINT8;
                                        break;
                                    case -51:
                                        sp8 = UINT16;
                                        break;
                                    case -50:
                                        sp8 = UINT32;
                                        break;
                                    case -49:
                                        sp8 = UINT64;
                                        break;
                                    case -48:
                                        sp8 = INT8;
                                        break;
                                    case -47:
                                        sp8 = INT16;
                                        break;
                                    case -46:
                                        sp8 = INT32;
                                        break;
                                    case -45:
                                        sp8 = INT64;
                                        break;
                                    case -44:
                                        sp8 = FIXEXT1;
                                        break;
                                    case -43:
                                        sp8 = FIXEXT2;
                                        break;
                                    case -42:
                                        sp8 = FIXEXT4;
                                        break;
                                    case -41:
                                        sp8 = FIXEXT8;
                                        break;
                                    case -40:
                                        sp8 = FIXEXT16;
                                        break;
                                    case -39:
                                        sp8 = STR8;
                                        break;
                                    case -38:
                                        sp8 = STR16;
                                        break;
                                    case -37:
                                        sp8 = STR32;
                                        break;
                                    case -36:
                                        sp8 = ARRAY16;
                                        break;
                                    case -35:
                                        sp8 = ARRAY32;
                                        break;
                                    case -34:
                                        sp8 = MAP16;
                                        break;
                                    case -33:
                                        sp8 = MAP32;
                                        break;
                                    default:
                                        sp8 = NEVER_USED;
                                        break;
                                }
                            } else {
                                sp8 = FIXMAP;
                            }
                        } else {
                            sp8 = FIXARRAY;
                        }
                    } else {
                        sp8 = FIXSTR;
                    }
                } else {
                    sp8 = NEGFIXINT;
                }
            } else {
                sp8 = POSFIXINT;
            }
            a1[i] = sp8;
        }
    }

    /* access modifiers changed from: public */
    sp8(int i) {
        this.a = i;
    }

    public final int a() {
        if (this != NEVER_USED) {
            return this.a;
        }
        throw new RuntimeException("Cannot convert NEVER_USED to ValueType");
    }
}
