package defpackage;

import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.Continuation;
import one.me.sdk.gallery.selectalbum.SelectAlbumWidget;

/* renamed from: rvc  reason: default package */
public final /* synthetic */ class rvc implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SelectAlbumWidget b;

    public /* synthetic */ rvc(SelectAlbumWidget selectAlbumWidget, int i) {
        this.a = i;
        this.b = selectAlbumWidget;
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [gwc, android.view.View] */
    public final Object invoke() {
        SelectAlbumWidget selectAlbumWidget = this.b;
        switch (this.a) {
            case 0:
                k77[] k77Arr = SelectAlbumWidget.Y;
                fwc fwc = new fwc(new sic(3, selectAlbumWidget), ((x4a) selectAlbumWidget.b.getValue()).a());
                ez3.N(new ck5(wx3.e(selectAlbumWidget.n0().w0, selectAlbumWidget.getViewLifecycleOwner().R(), ob7.o), new svc((Continuation) null, fwc), 5), selectAlbumWidget.getViewLifecycleScope());
                return fwc;
            case 1:
                k77[] k77Arr2 = SelectAlbumWidget.Y;
                RecyclerView recyclerView = new RecyclerView(selectAlbumWidget.getContext(), (AttributeSet) null);
                recyclerView.setId(s9a.d);
                recyclerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                recyclerView.getContext();
                recyclerView.setLayoutManager(new LinearLayoutManager());
                k77 k77 = SelectAlbumWidget.Y[1];
                recyclerView.setAdapter((fwc) selectAlbumWidget.c.getValue());
                recyclerView.setOutlineProvider(new tp0(0, dh4.c().getDisplayMetrics().density * 20.0f));
                urd.B(new wua(3, (Continuation) null, 13), recyclerView);
                return recyclerView;
            default:
                k77[] k77Arr3 = SelectAlbumWidget.Y;
                z0b z0b = new z0b(selectAlbumWidget.getContext());
                z0b.setStackFromBottom(false);
                z0b.setCallback(new x9(selectAlbumWidget, 4));
                z0b.addView(selectAlbumWidget.l0());
                urd.B(new pf0(3, (Continuation) null, 14), z0b);
                return z0b;
        }
    }
}
