package defpackage;

import android.graphics.Color;
import java.util.HashMap;
import java.util.HashSet;
import org.apache.http.cookie.ClientCookie;

/* renamed from: sxe  reason: default package */
public abstract /* synthetic */ class sxe {
    public static final boolean a(int i) {
        return i == 4;
    }

    public static final boolean b(int i) {
        return i == 8;
    }

    public static int c(String str) {
        if (str == null) {
            return 1;
        }
        int hashCode = str.hashCode();
        if (hashCode == 2527) {
            str.equals("ON");
        } else if (hashCode == 78159 && str.equals("OFF")) {
            return 2;
        }
        return 1;
    }

    public static int d(String str) {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1986891037:
                if (str.equals("NOBODY")) {
                    c = 0;
                    break;
                }
                break;
            case -1500732632:
                if (str.equals("_NONE_")) {
                    c = 1;
                    break;
                }
                break;
            case 215175251:
                if (str.equals("CONTACTS")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
                return 2;
            case 2:
                return 3;
            default:
                return 1;
        }
    }

    public static int e(String str) {
        if (str == null) {
            return 1;
        }
        int hashCode = str.hashCode();
        if (hashCode == 2527) {
            str.equals("ON");
        } else if (hashCode == 78159 && str.equals("OFF")) {
            return 2;
        }
        return 1;
    }

    public static /* synthetic */ int f(int i) {
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 4;
        }
        throw null;
    }

    public static /* synthetic */ boolean g(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
                return false;
            case 5:
            case 6:
                return true;
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw null;
        }
    }

    public static /* synthetic */ String h(int i) {
        if (i == 1) {
            return "vector";
        }
        if (i == 2) {
            return "group";
        }
        if (i == 3) {
            return ClientCookie.PATH_ATTR;
        }
        if (i == 4) {
            return "clip-path";
        }
        throw null;
    }

    public static /* synthetic */ int i(int i) {
        if (i == 1) {
            return 12;
        }
        if (i == 2) {
            return 16;
        }
        throw null;
    }

    public static /* synthetic */ String j(int i) {
        if (i == 1) {
            return "ON";
        }
        if (i == 2) {
            return "OFF";
        }
        throw null;
    }

    public static /* synthetic */ String k(int i) {
        if (i == 1) {
            return "ALL";
        }
        if (i == 2) {
            return "_NONE_";
        }
        if (i == 3) {
            return "CONTACTS";
        }
        throw null;
    }

    public static /* synthetic */ String l(int i) {
        if (i == 1) {
            return "ON";
        }
        if (i == 2) {
            return "OFF";
        }
        throw null;
    }

    public static int m(int i, int i2, long j) {
        return (Long.hashCode(j) + i) * i2;
    }

    public static String n(String str, r9e r9e, String str2, r9e r9e2) {
        return str + r9e + str2 + r9e2;
    }

    public static HashSet o(HashMap hashMap, String str, n9e n9e, int i) {
        hashMap.put(str, n9e);
        return new HashSet(i);
    }

    public static void p(int i, int i2, int i3, HashMap hashMap, String str) {
        hashMap.put(str, Integer.valueOf(Color.rgb(i, i2, i3)));
    }

    public static /* synthetic */ String q(int i) {
        switch (i) {
            case 1:
                return "UNKNOWN";
            case 2:
                return "VIDEO";
            case 3:
                return "PHOTO";
            case 4:
                return "PROFILE_PHOTO";
            case 5:
                return "FILE";
            case 6:
                return "AUDIO";
            case 7:
                return "EXTERNAL_GIF";
            case 8:
                return "STICKER";
            case 9:
                return "VIDEO_MESSAGE";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String r(int i) {
        switch (i) {
            case 1:
                return "NIL";
            case 2:
                return "BOOLEAN";
            case 3:
                return "INTEGER";
            case 4:
                return "FLOAT";
            case 5:
                return "STRING";
            case 6:
                return "BINARY";
            case 7:
                return "ARRAY";
            case 8:
                return "MAP";
            case 9:
                return "EXTENSION";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String s(int i) {
        switch (i) {
            case 1:
                return "UNKNOWN";
            case 2:
                return "VIDEO";
            case 3:
                return "PHOTO";
            case 4:
                return "PROFILE_PHOTO";
            case 5:
                return "FILE";
            case 6:
                return "AUDIO";
            case 7:
                return "EXTERNAL_GIF";
            case 8:
                return "STICKER";
            case 9:
                return "VIDEO_MESSAGE";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String t(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "CONTACTS" : "NONE" : "ALL";
    }

    public static /* synthetic */ String u(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "RELEASED" : "READY" : "PENDING_RELEASE" : "INITIALIZING" : "NOT_INITIALIZED";
    }

    public static /* synthetic */ int v(String str) {
        if (str == null) {
            throw new NullPointerException("Name is null");
        } else if (str.equals("UNKNOWN")) {
            return 1;
        } else {
            if (str.equals("VIDEO")) {
                return 2;
            }
            if (str.equals("PHOTO")) {
                return 3;
            }
            if (str.equals("PROFILE_PHOTO")) {
                return 4;
            }
            if (str.equals("FILE")) {
                return 5;
            }
            if (str.equals("AUDIO")) {
                return 6;
            }
            if (str.equals("EXTERNAL_GIF")) {
                return 7;
            }
            if (str.equals("STICKER")) {
                return 8;
            }
            if (str.equals("VIDEO_MESSAGE")) {
                return 9;
            }
            throw new IllegalArgumentException("No enum constant one.me.sdk.transfer.domain.UploadType.".concat(str));
        }
    }

    public static /* synthetic */ int w(String str) {
        if (str == null) {
            throw new NullPointerException("Name is null");
        } else if (str.equals("ATTENDEE")) {
            return 1;
        } else {
            if (str.equals("HAND_UP")) {
                return 2;
            }
            if (str.equals("FEEDBACK")) {
                return 3;
            }
            throw new IllegalArgumentException("No enum constant ru.ok.android.webrtc.signaling.waitingroom.a.".concat(str));
        }
    }
}
