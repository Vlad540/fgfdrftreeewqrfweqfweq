package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import kotlin.coroutines.Continuation;

/* renamed from: jkc  reason: default package */
public final class jkc extends l5e implements i26 {
    public final /* synthetic */ v2b X;
    public final /* synthetic */ byte[] Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jkc(v2b v2b, byte[] bArr, Continuation continuation) {
        super(2, continuation);
        this.X = v2b;
        this.Y = bArr;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new jkc(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        byte[] bArr;
        int i;
        int i2;
        Matrix matrix;
        Bitmap decodeByteArray;
        int G;
        int i3;
        boolean z = true;
        wx3.H(obj);
        v2b v2b = this.X;
        ((zd) ((knc) v2b.b)).e.getClass();
        int i4 = xs7.y;
        int i5 = 0;
        while (true) {
            int i6 = i5 + 3;
            bArr = this.Y;
            if (i6 >= bArr.length) {
                i = 0;
                break;
            }
            i3 = i5 + 1;
            if ((bArr[i5] & 255) != 255) {
                break;
            }
            byte b = bArr[i3] & 255;
            if (b != 255) {
                i3 = i5 + 2;
                if (!(b == 216 || b == 1)) {
                    if (b != 217 && b != 218) {
                        int G2 = xs7.G(bArr, i3, 2, false);
                        if (G2 >= 2 && (i3 = i3 + G2) <= bArr.length) {
                            if (b == 225 && G2 >= 8 && xs7.G(bArr, i5 + 4, 4, false) == 1165519206 && xs7.G(bArr, i5 + 8, 2, false) == 0) {
                                i5 += 10;
                                i = G2 - 8;
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            i5 = i3;
        }
        i = 0;
        i5 = i3;
        if (i > 8 && ((G = xs7.G(bArr, i5, 4, false)) == 1229531648 || G == 1296891946)) {
            if (G != 1229531648) {
                z = false;
            }
            int G3 = xs7.G(bArr, i5 + 4, 4, z) + 2;
            if (G3 >= 10 && G3 <= i) {
                int i7 = i5 + G3;
                int i8 = i - G3;
                int G4 = xs7.G(bArr, i7 - 2, 2, z);
                while (true) {
                    int i9 = G4 - 1;
                    if (G4 <= 0 || i8 < 12) {
                        break;
                    } else if (xs7.G(bArr, i7, 2, z) == 274) {
                        int G5 = xs7.G(bArr, i7 + 8, 2, z);
                        if (G5 == 3) {
                            i2 = 180;
                        } else if (G5 == 6) {
                            i2 = 90;
                        } else if (G5 == 8) {
                            i2 = 270;
                        }
                    } else {
                        i7 += 12;
                        i8 -= 12;
                        G4 = i9;
                    }
                }
                matrix = new Matrix();
                matrix.setRotate((float) i2);
                decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
                if (decodeByteArray.isMutable() || !matrix.isIdentity()) {
                    Bitmap createBitmap = Bitmap.createBitmap(decodeByteArray, 0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight(), matrix, true);
                    decodeByteArray.recycle();
                    decodeByteArray = createBitmap;
                }
                kn0 kn0 = new kn0(decodeByteArray, 0);
                knc knc = (knc) v2b.b;
                Uri c = ((zd) knc).c(kn0, knc.b(false));
                decodeByteArray.recycle();
                return c;
            }
        }
        i2 = 0;
        matrix = new Matrix();
        matrix.setRotate((float) i2);
        decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        Bitmap createBitmap2 = Bitmap.createBitmap(decodeByteArray, 0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight(), matrix, true);
        decodeByteArray.recycle();
        decodeByteArray = createBitmap2;
        kn0 kn02 = new kn0(decodeByteArray, 0);
        knc knc2 = (knc) v2b.b;
        Uri c2 = ((zd) knc2).c(kn02, knc2.b(false));
        decodeByteArray.recycle();
        return c2;
    }
}
