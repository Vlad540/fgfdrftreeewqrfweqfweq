package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* renamed from: ah1  reason: default package */
public final class ah1 extends l5e implements k26 {
    public final /* synthetic */ int X;
    public /* synthetic */ boolean Y;
    public /* synthetic */ Object Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ah1(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.X = i2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.X) {
            case 0:
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                ah1 ah1 = new ah1(3, (Continuation) obj3, 0);
                ah1.Z = (vye) obj;
                ah1.Y = booleanValue;
                return ah1.o(jue.a);
            case 1:
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                ah1 ah12 = new ah1(3, (Continuation) obj3, 1);
                ah12.Y = booleanValue2;
                ah12.Z = (we6) obj2;
                return ah12.o(jue.a);
            case 2:
                boolean booleanValue3 = ((Boolean) obj2).booleanValue();
                ah1 ah13 = new ah1(3, (Continuation) obj3, 2);
                ah13.Z = (ne7) obj;
                ah13.Y = booleanValue3;
                return ah13.o(jue.a);
            case 3:
                boolean booleanValue4 = ((Boolean) obj).booleanValue();
                ah1 ah14 = new ah1(3, (Continuation) obj3, 3);
                ah14.Y = booleanValue4;
                ah14.Z = (o46) obj2;
                return ah14.o(jue.a);
            case 4:
                boolean booleanValue5 = ((Boolean) obj2).booleanValue();
                ah1 ah15 = new ah1(3, (Continuation) obj3, 4);
                ah15.Z = (List) obj;
                ah15.Y = booleanValue5;
                return ah15.o(jue.a);
            case 5:
                boolean booleanValue6 = ((Boolean) obj2).booleanValue();
                ah1 ah16 = new ah1(3, (Continuation) obj3, 5);
                ah16.Z = (Map) obj;
                ah16.Y = booleanValue6;
                return ah16.o(jue.a);
            default:
                boolean booleanValue7 = ((Boolean) obj2).booleanValue();
                ah1 ah17 = new ah1(3, (Continuation) obj3, 6);
                ah17.Z = (oia) obj;
                ah17.Y = booleanValue7;
                return ah17.o(jue.a);
        }
    }

    public final Object o(Object obj) {
        switch (this.X) {
            case 0:
                wx3.H(obj);
                vye vye = (vye) this.Z;
                if (!this.Y) {
                    return Boolean.FALSE;
                }
                int ordinal = vye.ordinal();
                if (ordinal == 0) {
                    return Boolean.TRUE;
                }
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        return null;
                    }
                    if (ordinal != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                return Boolean.FALSE;
            case 1:
                wx3.H(obj);
                return this.Y ? (we6) this.Z : te6.c;
            case 2:
                wx3.H(obj);
                ne7 ne7 = (ne7) this.Z;
                if (this.Y) {
                    return ne7;
                }
                return null;
            case 3:
                wx3.H(obj);
                return new wia(Boolean.valueOf(this.Y), (o46) this.Z);
            case 4:
                wx3.H(obj);
                return this.Y ? (List) this.Z : hw4.a;
            case 5:
                wx3.H(obj);
                return this.Y ? ((Map) this.Z).values() : hw4.a;
            default:
                wx3.H(obj);
                boolean z = this.Y;
                int ordinal2 = ((oia) this.Z).ordinal();
                if (ordinal2 == 0) {
                    return nmf.a;
                }
                if (ordinal2 == 1 || ordinal2 == 2) {
                    return new omf(z);
                }
                if (ordinal2 == 3) {
                    return mmf.a;
                }
                throw new NoWhenBranchMatchedException();
        }
    }
}
