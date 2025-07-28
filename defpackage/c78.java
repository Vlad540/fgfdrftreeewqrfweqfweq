package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import one.me.messages.list.loader.MessageModel;
import one.me.messages.list.ui.MessagesListWidget;

/* renamed from: c78  reason: default package */
public final class c78 extends r6c {
    public final /* synthetic */ int a = 0;
    public int b;
    public int c;
    public int d;
    public int e;
    public final Object f;
    public final Object g;

    public c78(Context context, vz0 vz0, e78 e78) {
        this.f = vz0;
        this.g = e78;
        this.b = ViewConfiguration.get(context).getScaledTouchSlop();
        this.c = 50;
    }

    public final void b(RecyclerView recyclerView, int i, int i2) {
        View r;
        MessageModel K;
        View r2;
        switch (this.a) {
            case 0:
                int i3 = this.b;
                int i4 = this.c;
                if (i2 > 0) {
                    int i5 = this.e + i2;
                    this.e = i5;
                    if (i5 >= i4 || i2 >= i3) {
                        ((s16) this.g).invoke();
                        this.e = 0;
                        this.d = 0;
                        return;
                    }
                    return;
                } else if (i2 < 0) {
                    int i6 = this.d + i2;
                    this.d = i6;
                    if (Math.abs(i6) >= i4 || Math.abs(i2) >= i3) {
                        ((s16) this.f).invoke();
                        this.d = 0;
                        this.e = 0;
                        return;
                    }
                    return;
                } else {
                    return;
                }
            default:
                LinearLayoutManager q = gp0.q(recyclerView);
                if (q != null) {
                    this.b = q.W0();
                    int Y0 = q.Y0();
                    this.d = Y0;
                    int i7 = this.b;
                    if (i7 != -1 && Y0 != -1) {
                        int i8 = this.c;
                        Rect rect = (Rect) this.f;
                        if (i7 < i8 && (r2 = q.r(i7)) != null) {
                            r2.getLocalVisibleRect(rect);
                            if (((float) rect.height()) >= ((float) r2.getMeasuredHeight()) * 0.3f) {
                                this.c = this.b;
                            }
                        }
                        int i9 = this.d;
                        if (i9 > this.e && (r = q.r(i9)) != null) {
                            if (!r.getLocalVisibleRect(rect) || ((float) rect.height()) < ((float) r.getMeasuredHeight()) * 0.3f) {
                                this.d = q.X0();
                            }
                            int i10 = this.d;
                            boolean z = false;
                            if (i10 >= 0) {
                                MessagesListWidget messagesListWidget = (MessagesListWidget) this.g;
                                if (i10 < messagesListWidget.E0.j() && (K = messagesListWidget.E0.K(i10)) != null) {
                                    z = messagesListWidget.t0().H(K);
                                }
                            }
                            if (z) {
                                this.e = this.d;
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("Only linear layout manger supported");
        }
    }

    public c78(MessagesListWidget messagesListWidget) {
        this.g = messagesListWidget;
        this.f = new Rect();
        this.b = -1;
        this.c = -1;
        this.d = -1;
        this.e = -1;
    }
}
