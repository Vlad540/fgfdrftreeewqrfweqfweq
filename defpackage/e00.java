package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import ru.ok.tamtam.nano.Protos;

/* renamed from: e00  reason: default package */
public enum e00 {
    UNKNOWN("UNKNOWN"),
    CONTROL("CONTROL"),
    PHOTO("PHOTO"),
    VIDEO("VIDEO"),
    AUDIO("AUDIO"),
    STICKER("STICKER"),
    SHARE("SHARE"),
    APP("APP"),
    CALL("CALL"),
    FILE("FILE"),
    CONTACT("CONTACT"),
    PRESENT("PRESENT"),
    INLINE_KEYBOARD("INLINE_KEYBOARD"),
    LOCATION("LOCATION"),
    REPLY_KEYBOARD("REPLY_KEYBOARD"),
    VIDEO_MSG("VIDEO_MSG");
    
    public static final HashSet G0 = null;
    public static final HashSet H0 = null;
    public static final HashSet I0 = null;
    public static final HashSet J0 = null;
    public static final HashSet K0 = null;
    public static final HashSet L0 = null;
    public static final HashSet M0 = null;
    public final String a;

    static {
        e00 e00;
        e00 e002;
        e00 e003;
        e00 e004;
        e00 e005;
        e00 e006;
        e00 e007 = e005;
        e00 e008 = e004;
        e00 e009 = e003;
        e00 e0010 = e002;
        e00 e0011 = e00;
        G0 = new HashSet(Arrays.asList(new e00[]{e0011, e0010, e009, e008, e007}));
        H0 = new HashSet(Arrays.asList(new e00[]{e0011, e0010}));
        I0 = new HashSet(Collections.singletonList(e008));
        ArrayList arrayList = new ArrayList(1);
        Object obj = new Object[]{e007}[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        J0 = new HashSet(Collections.unmodifiableList(arrayList));
        K0 = new HashSet(Collections.singletonList(e009));
        L0 = new HashSet(Collections.singletonList(e007));
        M0 = new HashSet(Collections.singletonList(e006));
    }

    /* access modifiers changed from: public */
    e00(String str) {
        this.a = str;
    }

    public static e00 a(String str) {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1611296843:
                if (str.equals("LOCATION")) {
                    c = 0;
                    break;
                }
                break;
            case -1172269795:
                if (str.equals("STICKER")) {
                    c = 1;
                    break;
                }
                break;
            case -174141059:
                if (str.equals("VIDEO_MSG")) {
                    c = 2;
                    break;
                }
                break;
            case -113354035:
                if (str.equals("INLINE_KEYBOARD")) {
                    c = 3;
                    break;
                }
                break;
            case 65025:
                if (str.equals("APP")) {
                    c = 4;
                    break;
                }
                break;
            case 2060894:
                if (str.equals("CALL")) {
                    c = 5;
                    break;
                }
                break;
            case 2157948:
                if (str.equals("FILE")) {
                    c = 6;
                    break;
                }
                break;
            case 62628790:
                if (str.equals("AUDIO")) {
                    c = 7;
                    break;
                }
                break;
            case 76105234:
                if (str.equals("PHOTO")) {
                    c = 8;
                    break;
                }
                break;
            case 78862271:
                if (str.equals("SHARE")) {
                    c = 9;
                    break;
                }
                break;
            case 81665115:
                if (str.equals("VIDEO")) {
                    c = 10;
                    break;
                }
                break;
            case 399705243:
                if (str.equals("PRESENT")) {
                    c = 11;
                    break;
                }
                break;
            case 1669509120:
                if (str.equals("CONTACT")) {
                    c = 12;
                    break;
                }
                break;
            case 1669525821:
                if (str.equals("CONTROL")) {
                    c = 13;
                    break;
                }
                break;
            case 2103311804:
                if (str.equals("REPLY_KEYBOARD")) {
                    c = 14;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return LOCATION;
            case 1:
                return STICKER;
            case 2:
                return VIDEO_MSG;
            case 3:
                return INLINE_KEYBOARD;
            case 4:
                return APP;
            case 5:
                return CALL;
            case 6:
                return FILE;
            case 7:
                return AUDIO;
            case 8:
                return PHOTO;
            case 9:
                return SHARE;
            case 10:
                return VIDEO;
            case 11:
                return PRESENT;
            case Protos.Attaches.Attach.PRESENT /*12*/:
                return CONTACT;
            case 13:
                return CONTROL;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                return REPLY_KEYBOARD;
            default:
                return UNKNOWN;
        }
    }
}
