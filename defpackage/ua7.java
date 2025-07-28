package defpackage;

import androidx.fragment.app.FragmentWrapperWidget;
import ru.ok.messages.location.FrgLocationMap;

/* renamed from: ua7  reason: default package */
public final /* synthetic */ class ua7 implements i34 {
    public final /* synthetic */ Long X;
    public final /* synthetic */ long a;
    public final /* synthetic */ long b;
    public final /* synthetic */ dm7 c;
    public final /* synthetic */ float o;

    public /* synthetic */ ua7(long j, long j2, dm7 dm7, float f, Long l) {
        this.a = j;
        this.b = j2;
        this.c = dm7;
        this.o = f;
        this.X = l;
    }

    public final Object a() {
        return new FragmentWrapperWidget(2050629066, FrgLocationMap.class, "ru.ok.messages.location.FrgLocationMap", jjd.j(new wia[]{new wia("ru.ok.tamtam.extra.CHAT_ID", Long.valueOf(this.a)), new wia("ru.ok.tamtam.extra.MESSAGE_ID", Long.valueOf(this.b)), new wia("ru.ok.tamtam.extra.LOCATION", this.c), new wia("ru.ok.tamtam.extra.ZOOM", Float.valueOf(this.o)), new wia("ru.ok.tamtam.extra.CONTACT_ID", this.X)}));
    }
}
