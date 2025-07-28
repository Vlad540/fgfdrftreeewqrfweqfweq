package defpackage;

import android.view.View;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.search.SearchMessageBottomWidget;

/* renamed from: brc  reason: default package */
public final /* synthetic */ class brc implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ SearchMessageBottomWidget b;

    public /* synthetic */ brc(SearchMessageBottomWidget searchMessageBottomWidget, int i) {
        this.a = i;
        this.b = searchMessageBottomWidget;
    }

    public final void onClick(View view) {
        SearchMessageBottomWidget searchMessageBottomWidget = this.b;
        switch (this.a) {
            case 0:
                if (searchMessageBottomWidget.Z) {
                    ki2 ki2 = (ki2) searchMessageBottomWidget.p0().o.a;
                    int i = ki2.d;
                    if (i - 1 >= 0) {
                        int i2 = i - 1;
                        ki2.d = i2;
                        hi2 hi2 = ki2.g;
                        if (hi2 != null) {
                            hi2.d(i2, ki2.k);
                        }
                        hi2 hi22 = ki2.g;
                        if (hi22 != null) {
                            hi22.e((ds8) ki2.f.get(ki2.d - 1));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                if (searchMessageBottomWidget.Y) {
                    ki2 ki22 = (ki2) searchMessageBottomWidget.p0().o.a;
                    int i3 = ki22.d + 1;
                    ArrayList arrayList = ki22.f;
                    if (i3 <= arrayList.size()) {
                        int i4 = ki22.d + 1;
                        ki22.d = i4;
                        hi2 hi23 = ki22.g;
                        if (hi23 != null) {
                            hi23.d(i4, ki22.k);
                        }
                        hi2 hi24 = ki22.g;
                        if (hi24 != null) {
                            hi24.e((ds8) arrayList.get(ki22.d - 1));
                        }
                        if (ki22.d + 1 <= arrayList.size() && ki22.g != null) {
                            ds8 ds8 = (ds8) arrayList.get(ki22.d - 1);
                        }
                    }
                    String str = ki22.c;
                    if (ki22.h && arrayList.size() - ki22.d < 5 && ki22.j != 0 && str != null && str.length() != 0) {
                        udd.p("ki2", "Search for next messages", new Object[0]);
                        ki22.h = false;
                        xs7.E(ki22.e, (hu3) null, (ru3) null, new ii2(ki22, str, ki22.j, (Continuation) null), 3);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
