package defpackage;

import android.os.Looper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.util.LangUtils;
import org.webrtc.PeerConnectionFactory;
import ru.ok.tamtam.nano.Protos;

/* renamed from: j67  reason: default package */
public final /* synthetic */ class j67 implements h67, of3, v1b, j26, zq7, mk0, d38, e38, lh7, y48 {
    public final /* synthetic */ int a;

    public /* synthetic */ j67(int i) {
        this.a = i;
    }

    public int a(Object obj) {
        switch (this.a) {
            case 19:
                String str = ((o28) obj).a;
                if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
                    return 1;
                }
                return (mze.a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /*20*/:
                String str2 = ((p28) obj).a;
                if (str2.startsWith("OMX.google") || str2.startsWith("c2.android")) {
                    return 1;
                }
                return (oze.a >= 26 || !str2.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
            case 21:
                return ((o28) obj).a.startsWith("OMX.google") ? 1 : 0;
            default:
                return ((p28) obj).a.startsWith("OMX.google") ? 1 : 0;
        }
    }

    public void accept(Object obj) {
        Throwable th = (Throwable) obj;
        switch (this.a) {
            case 1:
                udd.s("kk7", "Can't load frames", th);
                return;
            default:
                udd.s("vs7", "Got error on chat invalidation", th);
                return;
        }
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 3:
                return obj.toString();
            case 6:
                return ((xib) obj).c;
            case 7:
                udd.s("vs7", "searchChatsAndMessage: search server messages exception", (Throwable) obj);
                return Collections.emptyList();
            case 8:
                udd.s("vs7", "searchChatsAndMessage: search server messages exception", (Throwable) obj);
                return Collections.emptyList();
            case 9:
                return new us7(ts7.c, (List) obj);
            case 10:
                udd.s("vs7", "searchChatsAndMessage: search local chats exception", (Throwable) obj);
                return Collections.emptyList();
            case 11:
                return new us7(ts7.a, (List) obj);
            default:
                List<yib> list = (List) obj;
                ts7 ts7 = ts7.b;
                ArrayList arrayList = new ArrayList(list.size());
                for (yib yib : list) {
                    try {
                        arrayList.add(new prc(5, (String) null, yib.b, (i22) null, (tf3) null, (ym8) null, 0, yib));
                    } catch (Throwable th) {
                        throw new RuntimeException(th);
                    }
                }
                return new us7(ts7, arrayList);
        }
    }

    public Object b() {
        switch (this.a) {
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return new dv7();
            case PeerConnectionFactory.Options.ADAPTER_TYPE_LOOPBACK /*16*/:
                return new su1();
            case LangUtils.HASH_SEED /*17*/:
                return new c0b();
            default:
                return new ny2();
        }
    }

    public void c(o48 o48) {
        switch (this.a) {
            case 24:
                if (o48.isConnected()) {
                    r38 r38 = o48.a;
                    r38.getClass();
                    oyb.k(Looper.myLooper() == r38.X.getLooper());
                    r38.o.getClass();
                    return;
                }
                return;
            case 25:
                wn6.o(o48);
                throw null;
            case 26:
                o48.h.f(26, new i74(21));
                return;
            case 27:
                r38 r382 = o48.a;
                Objects.requireNonNull(r382);
                r382.G(new eq6(6, r382));
                return;
            case 28:
                wn6.o(o48);
                throw null;
            default:
                if (o48.isConnected()) {
                    r38 r383 = o48.a;
                    r383.getClass();
                    oyb.k(Looper.myLooper() == r383.X.getLooper());
                    r383.o.getClass();
                    return;
                }
                return;
        }
    }

    public void invoke(Object obj) {
        ((hya) obj).h(1);
    }

    /* JADX WARNING: type inference failed for: r3v4, types: [java.lang.Object, dp7] */
    public Object parse(m67 m67) {
        switch (this.a) {
            case 0:
                return Boolean.valueOf(m67.a0());
            default:
                ? obj = new Object();
                m67.s();
                while (m67.hasNext()) {
                    String T = m67.T();
                    T.getClass();
                    char c = 65535;
                    switch (T.hashCode()) {
                        case -1956766558:
                            if (T.equals("auth_token")) {
                                c = 0;
                                break;
                            }
                            break;
                        case -22145738:
                            if (T.equals("session_key")) {
                                c = 1;
                                break;
                            }
                            break;
                        case 115792:
                            if (T.equals("uid")) {
                                c = 2;
                                break;
                            }
                            break;
                        case 438353305:
                            if (T.equals("session_secret_key")) {
                                c = 3;
                                break;
                            }
                            break;
                        case 1460528453:
                            if (T.equals("auth_hash")) {
                                c = 4;
                                break;
                            }
                            break;
                        case 1955725576:
                            if (T.equals("api_server")) {
                                c = 5;
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                            obj.d = m67.H();
                            break;
                        case 1:
                            obj.b = m67.H();
                            break;
                        case 2:
                            obj.a = m67.H();
                            break;
                        case 3:
                            obj.c = m67.H();
                            break;
                        case 4:
                            obj.f = m67.H();
                            break;
                        case 5:
                            obj.e = m67.H();
                            break;
                        default:
                            m67.z();
                            break;
                    }
                }
                m67.q();
                return obj;
        }
    }

    public boolean test(Object obj) {
        return !((Locale) obj).getLanguage().equals(Locale.ENGLISH.getLanguage());
    }

    public Object apply(Object obj, Object obj2) {
        ss7 ss7 = (ss7) obj;
        us7 us7 = (us7) obj2;
        ts7 ts7 = us7.b;
        List list = us7.c;
        synchronized (ss7) {
            ss7.a.add(ts7);
            ArrayList arrayList = new ArrayList(ss7.b);
            arrayList.addAll(gsc.c(arrayList, list));
            arrayList.sort(new xb4(8));
            ss7.b = arrayList;
        }
        return ss7;
    }
}
