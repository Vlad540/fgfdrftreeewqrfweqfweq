package defpackage;

import java.util.ArrayList;
import java.util.List;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* renamed from: m2c  reason: default package */
public final /* synthetic */ class m2c implements j26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ n2c b;
    public final /* synthetic */ List c;

    public /* synthetic */ m2c(n2c n2c, List list, int i) {
        this.a = i;
        this.b = n2c;
        this.c = list;
    }

    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                n2c n2c = this.b;
                n2c.getClass();
                return new y63(1, new pd9(n2c, (b2c) obj, (ArrayList) this.c, 1));
            case 1:
                n2c n2c2 = this.b;
                n2c2.getClass();
                return new y63(1, new k2c(n2c2, (OneMeRoomDatabase) obj, this.c, 0));
            default:
                n2c n2c3 = this.b;
                n2c3.getClass();
                return new y63(1, new k2c(n2c3, (OneMeRoomDatabase) obj, (ArrayList) this.c, 1));
        }
    }
}
