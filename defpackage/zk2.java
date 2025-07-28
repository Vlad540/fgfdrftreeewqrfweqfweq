package defpackage;

import android.app.Activity;
import android.graphics.Point;
import android.view.View;
import android.view.WindowInsets;
import java.util.Collections;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.ChatScreen;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* renamed from: zk2  reason: default package */
public final class zk2 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zk2(Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.Y = chatScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((zk2) n(obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        zk2 zk2 = new zk2(continuation, this.Y);
        zk2.X = obj;
        return zk2;
    }

    public final Object o(Object obj) {
        View videoMessageRecordAnchor;
        Activity d;
        wx3.H(obj);
        b3c b3c = (g3c) this.X;
        boolean z = b3c instanceof b3c;
        jv5 jv5 = null;
        ChatScreen chatScreen = this.Y;
        if (z) {
            k77[] k77Arr = ChatScreen.n1;
            nn2 L0 = chatScreen.L0();
            List singletonList = Collections.singletonList(b3c.a);
            Long w = chatScreen.B0().w();
            pt8 v = chatScreen.B0().v();
            if (v != null) {
                jv5 = v.a();
            }
            L0.B((CharSequence) null, singletonList, false, w, jv5);
            tt6 tt6 = (tt6) chatScreen.k1.getValue();
            if (tt6 != null) {
                tt6.f(Collections.singleton(new st6(qt6.SEND_AUDIO_MESSAGE, 1)), mnc.Q0);
            }
        } else if (b3c instanceof e3c) {
            ChatScreen.P0(chatScreen, (Integer) null, String.valueOf(((e3c) b3c).a.a(chatScreen.getContext())), (Integer) null, (Integer) null, 13);
        } else if (b3c instanceof d3c) {
            ul2 ul2 = ul2.c;
            if (!ul2.P1().d() && (d = ((y3a) ul2.P1().a()).f().C().d()) != null) {
                d.finish();
            }
        } else if (b3c instanceof f3c) {
            k77[] k77Arr2 = ChatScreen.n1;
            MessageWriteWidget C0 = chatScreen.C0();
            if (C0 != null) {
                f3c f3c = (f3c) b3c;
                int[] iArr = new int[2];
                int ordinal = f3c.a.ordinal();
                if (ordinal == 0) {
                    videoMessageRecordAnchor = C0.p0().getVideoMessageRecordAnchor();
                } else if (ordinal == 1) {
                    videoMessageRecordAnchor = C0.p0().getAudioRecordAnchor();
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                View view = videoMessageRecordAnchor;
                if (view != null) {
                    view.getLocationOnScreen(iArr);
                    int p = me4.p((float) 18, dh4.c().getDisplayMetrics().density, (jjd.o(C0.getContext()) - iArr[0]) - (view.getWidth() / 2));
                    WindowInsets rootWindowInsets = C0.requireView().getRootWindowInsets();
                    int i = rootWindowInsets != null ? nsf.f((View) null, rootWindowInsets).a.f(7).d : 0;
                    int i2 = e87.a;
                    Point point = new Point(p, (C0.p0().getHeight() - a24.X(((float) 8) * dh4.c().getDisplayMetrics().density)) + i + (e87.b(e87.c) ? e87.a(C0.getContext()) : 0));
                    jme jme = C0.H0;
                    if (jme == null || !jme.isShowing()) {
                        jme jme2 = C0.H0;
                        if (jme2 != null) {
                            jme2.dismiss();
                        }
                        jme jme3 = new jme(C0.getContext(), view, new ib7(28), (s16) null, 2, 3, 8);
                        jme3.d(f3c.b);
                        jme3.e(point, 8388693, 3000);
                        jme3.setOnDismissListener(new su8(C0, 0));
                        C0.H0 = jme3;
                    } else {
                        jme jme4 = C0.H0;
                        if (jme4 != null) {
                            jme4.e(point, 8388693, 3000);
                        }
                    }
                }
            }
        } else if (b3c instanceof c3c) {
            c3c c3c = (c3c) b3c;
            int ordinal2 = c3c.a.ordinal();
            boolean z2 = c3c.b;
            if (ordinal2 == 0) {
                k77[] k77Arr3 = ChatScreen.n1;
                nn2 L02 = chatScreen.L0();
                i22 i22 = (i22) L02.Z0.a.getValue();
                if (i22 != null) {
                    long j = i22.b.a;
                    t97 t97 = L02.K0;
                    if (z2) {
                        eha eha = (eha) t97.getValue();
                        eha.getClass();
                        if (j != 0) {
                            eha.f(j, e00.F0, -2);
                        }
                    } else {
                        eha eha2 = (eha) t97.getValue();
                        if (j == 0) {
                            eha2.getClass();
                        } else {
                            eha2.getClass();
                            eha.b(j, -2);
                        }
                    }
                }
            } else if (ordinal2 == 1) {
                k77[] k77Arr4 = ChatScreen.n1;
                nn2 L03 = chatScreen.L0();
                i22 i222 = (i22) L03.Z0.a.getValue();
                if (i222 != null) {
                    long j2 = i222.b.a;
                    t97 t972 = L03.K0;
                    if (z2) {
                        eha eha3 = (eha) t972.getValue();
                        eha3.getClass();
                        if (j2 != 0) {
                            eha3.f(j2, e00.Y, -1);
                        }
                    } else {
                        eha eha4 = (eha) t972.getValue();
                        if (j2 == 0) {
                            eha4.getClass();
                        } else {
                            eha4.getClass();
                            eha.b(j2, -1);
                        }
                    }
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return jue.a;
    }
}
