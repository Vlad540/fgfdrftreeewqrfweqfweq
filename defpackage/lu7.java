package defpackage;

import android.os.Bundle;
import android.text.Spannable;
import android.text.Spanned;
import android.text.style.URLSpan;
import io.reactivex.rxjava3.exceptions.OnErrorNotImplementedException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: lu7  reason: default package */
public final class lu7 implements i83, i13, goe, oaa, vze, of3, gg9, gw3, kw9 {
    public static final lu7 a = new Object();
    public static final lu7 b = new Object();
    public static final lu7 c = new Object();
    public static final lu7 o = new Object();

    public static f91 a(String str) {
        return str.equals("action-open-call") ? b91.a : str.equals("action-accept-call") ? w81.a : str.equals("action-finished-call") ? z81.a : str.equals("action-decline-call") ? y81.a : str.equals("action-open-incoming") ? c91.a : str.equals("action-join-link") ? a91.a : str.equals("action-microphone-state") ? x81.a : str.equals("action-rate-call") ? d91.a : e91.a;
    }

    public static on8 g(pda pda) {
        return new on8(pda.a().c().a.l, pda.a().f().a.l, false, 3, false, false, 1008);
    }

    public static d8b k(String str) {
        pz4 pz4 = d8b.Y;
        pz4.getClass();
        u1 u1Var = new u1(0, pz4);
        while (u1Var.hasNext()) {
            d8b d8b = (d8b) u1Var.next();
            if (hhd.f(d8b.a, str)) {
                return d8b;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public static Spannable l(CharSequence charSequence, int i, boolean z, boolean z2, u16 u16) {
        if (!(charSequence instanceof Spannable) || charSequence.length() == 0) {
            return null;
        }
        Spanned spanned = (Spanned) charSequence;
        Object[] spans = spanned.getSpans(0, spanned.length(), Object.class);
        if (spans.length == 0) {
            return (Spannable) charSequence;
        }
        for (Object obj : spans) {
            if (obj instanceof efb) {
                efb efb = (efb) obj;
                efb.b = i;
                efb.c = z;
            } else if ((obj instanceof URLSpan) && !(obj instanceof nf7)) {
                Spannable spannable = (Spannable) charSequence;
                int spanStart = spannable.getSpanStart(obj);
                int spanEnd = spannable.getSpanEnd(obj);
                try {
                    ((Spannable) charSequence).removeSpan(obj);
                    ((Spannable) charSequence).setSpan(new nf7(((URLSpan) obj).getURL(), i, z, z2), spanStart, spanEnd, 33);
                } catch (Throwable unused) {
                }
            }
            if (u16 != null) {
                u16.invoke(obj);
            }
        }
        return (Spannable) charSequence;
    }

    public static /* synthetic */ Spannable m(CharSequence charSequence, int i, int i2) {
        return l(charSequence, i, (i2 & 4) != 0, false, (u16) null);
    }

    public void accept(Object obj) {
        xs7.F(new OnErrorNotImplementedException((Throwable) obj));
    }

    public utc b() {
        return new si5(-9223372036854775807L);
    }

    public void c(long j) {
    }

    public long d(q74 q74) {
        return -1;
    }

    public void e(String str) {
        udd.q("RLottie", str);
    }

    public void f() {
        zu2.c.P1().b(":chats-search", (Bundle) null);
    }

    public Object h(uwb uwb) {
        return kjd.r((Executor) uwb.f(new pjb(zte.class, Executor.class)));
    }

    public int i(Object obj) {
        return ((jl8) obj).U();
    }

    public void j(String str, Throwable th) {
        udd.s("RLottie", str, th);
    }

    public void o(Throwable th) {
        udd.s("RLottie", "fail!", th);
    }

    public lbe q(ws8 ws8) {
        int i;
        String str;
        try {
            i = jjd.K(ws8);
        } catch (Throwable th) {
            udd.S("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
            Iterator it = uzc.a.iterator();
            while (it.hasNext()) {
                ((ny9) it.next()).getClass();
                ny9.a(th);
            }
            int t = hr1.t(m4b.a);
            if (t == 0) {
                i = 0;
            } else if (t != 1) {
                throw new NoWhenBranchMatchedException();
            } else {
                throw th;
            }
        }
        if (i == 0) {
            return null;
        }
        Set set = qw4.a;
        boolean z = false;
        j22 j22 = null;
        Set set2 = set;
        for (int i2 = 0; i2 < i; i2++) {
            try {
                str = jjd.M(ws8);
            } catch (Throwable th2) {
                udd.S("ServerPayload/PayloadCatching", "payloadCatching catch error", th2);
                Iterator it2 = uzc.a.iterator();
                while (it2.hasNext()) {
                    ((ny9) it2.next()).getClass();
                    ny9.a(th2);
                }
                int t2 = hr1.t(m4b.a);
                if (t2 == 0) {
                    str = null;
                } else if (t2 != 1) {
                    throw new NoWhenBranchMatchedException();
                } else {
                    throw th2;
                }
            }
            if (str != null) {
                int hashCode = str.hashCode();
                if (hashCode != -1690743503) {
                    if (hashCode != 115180) {
                        if (hashCode == 3052376 && str.equals("chat")) {
                            try {
                                j22 = j22.a(ws8);
                            } catch (Throwable th3) {
                                udd.S("ServerPayload/PayloadCatching", "payloadCatching catch error", th3);
                                Iterator it3 = uzc.a.iterator();
                                while (it3.hasNext()) {
                                    ((ny9) it3.next()).getClass();
                                    ny9.a(th3);
                                }
                                int t3 = hr1.t(m4b.a);
                                if (t3 == 0) {
                                    j22 = null;
                                } else if (t3 != 1) {
                                    throw new NoWhenBranchMatchedException();
                                } else {
                                    throw th3;
                                }
                            }
                        }
                    } else if (str.equals("ttl")) {
                        try {
                            z = jjd.E(ws8);
                        } catch (Throwable th4) {
                            udd.S("ServerPayload/PayloadCatching", "payloadCatching catch error", th4);
                            Iterator it4 = uzc.a.iterator();
                            while (it4.hasNext()) {
                                ((ny9) it4.next()).getClass();
                                ny9.a(th4);
                            }
                            int t4 = hr1.t(m4b.a);
                            if (t4 == 0) {
                                z = false;
                            } else if (t4 != 1) {
                                throw new NoWhenBranchMatchedException();
                            } else {
                                throw th4;
                            }
                        }
                    }
                } else if (str.equals("messageIds")) {
                    try {
                        set2 = jjd.U(ws8, new qr4(14));
                    } catch (Throwable th5) {
                        udd.S("ServerPayload/PayloadCatching", "payloadCatching catch error", th5);
                        Iterator it5 = uzc.a.iterator();
                        while (it5.hasNext()) {
                            ((ny9) it5.next()).getClass();
                            ny9.a(th5);
                        }
                        int t5 = hr1.t(m4b.a);
                        if (t5 == 0) {
                            set2 = set;
                        } else if (t5 != 1) {
                            throw new NoWhenBranchMatchedException();
                        } else {
                            throw th5;
                        }
                    }
                }
                try {
                    ws8.z();
                } catch (Throwable th6) {
                    udd.S("ServerPayload/PayloadCatching", "payloadCatching catch error", th6);
                    Iterator it6 = uzc.a.iterator();
                    while (it6.hasNext()) {
                        ((ny9) it6.next()).getClass();
                        ny9.a(th6);
                    }
                    int t6 = hr1.t(m4b.a);
                    if (t6 != 0) {
                        if (t6 != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        throw th6;
                    }
                }
            }
        }
        if (j22 == null) {
            return null;
        }
        return new lm9(j22, set2, z);
    }
}
