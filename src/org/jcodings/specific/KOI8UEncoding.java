/*
 * Permission is hereby granted, free of charge, to any person obtaining a copy of 
 * this software and associated documentation files (the "Software"), to deal in 
 * the Software without restriction, including without limitation the rights to 
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies 
 * of the Software, and to permit persons to whom the Software is furnished to do
 * so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, 
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE 
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER 
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, 
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE 
 * SOFTWARE.
 */
package org.jcodings.specific;

import org.jcodings.CaseFoldMapEncoding;
import org.jcodings.IntHolder;

final public class KOI8UEncoding extends CaseFoldMapEncoding {

    protected KOI8UEncoding() {
        super("KOI8-U", KOI8U_CtypeTable, KOI8U_ToLowerCaseTable, KOI8U_CaseFoldMap, false);
    }

    @Override
    public int mbcCaseFold(int flag, byte[]bytes, IntHolder pp, int end, byte[]lower) {
        int p = pp.value;
        int lowerP = 0;

        lower[lowerP] = LowerCaseTable[bytes[p] & 0xff];
        pp.value++;
        return 1;
    }
    
    @Override
    public boolean isCodeCType(int code, int ctype) {
        return code < 256 ? isCodeCTypeInternal(code, ctype) : false;
    }
    
    static final short KOI8U_CtypeTable[] = {
        0x4008, 0x4008, 0x4008, 0x4008, 0x4008, 0x4008, 0x4008, 0x4008,
        0x4008, 0x420c, 0x4209, 0x4208, 0x4208, 0x4208, 0x4008, 0x4008,
        0x4008, 0x4008, 0x4008, 0x4008, 0x4008, 0x4008, 0x4008, 0x4008,
        0x4008, 0x4008, 0x4008, 0x4008, 0x4008, 0x4008, 0x4008, 0x4008,
        0x4284, 0x41a0, 0x41a0, 0x41a0, 0x41a0, 0x41a0, 0x41a0, 0x41a0,
        0x41a0, 0x41a0, 0x41a0, 0x41a0, 0x41a0, 0x41a0, 0x41a0, 0x41a0,
        0x78b0, 0x78b0, 0x78b0, 0x78b0, 0x78b0, 0x78b0, 0x78b0, 0x78b0,
        0x78b0, 0x78b0, 0x41a0, 0x41a0, 0x41a0, 0x41a0, 0x41a0, 0x41a0,
        0x41a0, 0x7ca2, 0x7ca2, 0x7ca2, 0x7ca2, 0x7ca2, 0x7ca2, 0x74a2,
        0x74a2, 0x74a2, 0x74a2, 0x74a2, 0x74a2, 0x74a2, 0x74a2, 0x74a2,
        0x74a2, 0x74a2, 0x74a2, 0x74a2, 0x74a2, 0x74a2, 0x74a2, 0x74a2,
        0x74a2, 0x74a2, 0x74a2, 0x41a0, 0x41a0, 0x41a0, 0x41a0, 0x51a0,
        0x41a0, 0x78e2, 0x78e2, 0x78e2, 0x78e2, 0x78e2, 0x78e2, 0x70e2,
        0x70e2, 0x70e2, 0x70e2, 0x70e2, 0x70e2, 0x70e2, 0x70e2, 0x70e2,
        0x70e2, 0x70e2, 0x70e2, 0x70e2, 0x70e2, 0x70e2, 0x70e2, 0x70e2,
        0x70e2, 0x70e2, 0x70e2, 0x41a0, 0x41a0, 0x41a0, 0x41a0, 0x4008,
        0x00a0, 0x00a0, 0x00a0, 0x00a0, 0x00a0, 0x00a0, 0x00a0, 0x00a0,
        0x00a0, 0x00a0, 0x00a0, 0x00a0, 0x00a0, 0x00a0, 0x00a0, 0x00a0,
        0x00a0, 0x00a0, 0x00a0, 0x00a0, 0x00a0, 0x00a0, 0x00a0, 0x00a0,
        0x00a0, 0x00a0, 0x0284, 0x00a0, 0x00a0, 0x10a0, 0x01a0, 0x00a0,
        0x00a0, 0x00a0, 0x00a0, 0x30e2, 0x30e2, 0x00a0, 0x30e2, 0x30e2,
        0x00a0, 0x00a0, 0x00a0, 0x00a0, 0x00a0, 0x30e2, 0x00a0, 0x00a0,
        0x00a0, 0x00a0, 0x00a0, 0x34a2, 0x34a2, 0x00a0, 0x34a2, 0x34a2,
        0x00a0, 0x00a0, 0x00a0, 0x00a0, 0x00a0, 0x34a2, 0x00a0, 0x00a0,
        0x30e2, 0x30e2, 0x30e2, 0x30e2, 0x30e2, 0x30e2, 0x30e2, 0x30e2,
        0x30e2, 0x30e2, 0x30e2, 0x30e2, 0x30e2, 0x30e2, 0x30e2, 0x30e2,
        0x30e2, 0x30e2, 0x30e2, 0x30e2, 0x30e2, 0x30e2, 0x30e2, 0x30e2,
        0x30e2, 0x30e2, 0x30e2, 0x30e2, 0x30e2, 0x30e2, 0x30e2, 0x30e2,
        0x34a2, 0x34a2, 0x34a2, 0x34a2, 0x34a2, 0x34a2, 0x34a2, 0x34a2,
        0x34a2, 0x34a2, 0x34a2, 0x34a2, 0x34a2, 0x34a2, 0x34a2, 0x34a2,
        0x34a2, 0x34a2, 0x34a2, 0x34a2, 0x34a2, 0x34a2, 0x34a2, 0x34a2,
        0x34a2, 0x34a2, 0x34a2, 0x34a2, 0x34a2, 0x34a2, 0x34a2, 0x34a2
    };
    
    static final byte KOI8U_ToLowerCaseTable[] = {
        (byte)'\000', (byte)'\001', (byte)'\002', (byte)'\003', (byte)'\004', (byte)'\005', (byte)'\006', (byte)'\007',
        (byte)'\010', (byte)'\011', (byte)'\012', (byte)'\013', (byte)'\014', (byte)'\015', (byte)'\016', (byte)'\017',
        (byte)'\020', (byte)'\021', (byte)'\022', (byte)'\023', (byte)'\024', (byte)'\025', (byte)'\026', (byte)'\027',
        (byte)'\030', (byte)'\031', (byte)'\032', (byte)'\033', (byte)'\034', (byte)'\035', (byte)'\036', (byte)'\037',
        (byte)'\040', (byte)'\041', (byte)'\042', (byte)'\043', (byte)'\044', (byte)'\045', (byte)'\046', (byte)'\047',
        (byte)'\050', (byte)'\051', (byte)'\052', (byte)'\053', (byte)'\054', (byte)'\055', (byte)'\056', (byte)'\057',
        (byte)'\060', (byte)'\061', (byte)'\062', (byte)'\063', (byte)'\064', (byte)'\065', (byte)'\066', (byte)'\067',
        (byte)'\070', (byte)'\071', (byte)'\072', (byte)'\073', (byte)'\074', (byte)'\075', (byte)'\076', (byte)'\077',
        (byte)'\100', (byte)'\141', (byte)'\142', (byte)'\143', (byte)'\144', (byte)'\145', (byte)'\146', (byte)'\147',
        (byte)'\150', (byte)'\151', (byte)'\152', (byte)'\153', (byte)'\154', (byte)'\155', (byte)'\156', (byte)'\157',
        (byte)'\160', (byte)'\161', (byte)'\162', (byte)'\163', (byte)'\164', (byte)'\165', (byte)'\166', (byte)'\167',
        (byte)'\170', (byte)'\171', (byte)'\172', (byte)'\133', (byte)'\134', (byte)'\135', (byte)'\136', (byte)'\137',
        (byte)'\140', (byte)'\141', (byte)'\142', (byte)'\143', (byte)'\144', (byte)'\145', (byte)'\146', (byte)'\147',
        (byte)'\150', (byte)'\151', (byte)'\152', (byte)'\153', (byte)'\154', (byte)'\155', (byte)'\156', (byte)'\157',
        (byte)'\160', (byte)'\161', (byte)'\162', (byte)'\163', (byte)'\164', (byte)'\165', (byte)'\166', (byte)'\167',
        (byte)'\170', (byte)'\171', (byte)'\172', (byte)'\173', (byte)'\174', (byte)'\175', (byte)'\176', (byte)'\177',
        (byte)'\200', (byte)'\201', (byte)'\202', (byte)'\203', (byte)'\204', (byte)'\205', (byte)'\206', (byte)'\207',
        (byte)'\210', (byte)'\211', (byte)'\212', (byte)'\213', (byte)'\214', (byte)'\215', (byte)'\216', (byte)'\217',
        (byte)'\220', (byte)'\221', (byte)'\222', (byte)'\223', (byte)'\224', (byte)'\225', (byte)'\226', (byte)'\227',
        (byte)'\230', (byte)'\231', (byte)'\232', (byte)'\233', (byte)'\234', (byte)'\235', (byte)'\236', (byte)'\237',
        (byte)'\240', (byte)'\241', (byte)'\242', (byte)'\243', (byte)'\244', (byte)'\245', (byte)'\246', (byte)'\247',
        (byte)'\250', (byte)'\251', (byte)'\252', (byte)'\253', (byte)'\254', (byte)'\255', (byte)'\256', (byte)'\257',
        (byte)'\260', (byte)'\261', (byte)'\262', (byte)'\243', (byte)'\244', (byte)'\265', (byte)'\246', (byte)'\247',
        (byte)'\270', (byte)'\271', (byte)'\272', (byte)'\273', (byte)'\274', (byte)'\255', (byte)'\276', (byte)'\277',
        (byte)'\300', (byte)'\301', (byte)'\302', (byte)'\303', (byte)'\304', (byte)'\305', (byte)'\306', (byte)'\307',
        (byte)'\310', (byte)'\311', (byte)'\312', (byte)'\313', (byte)'\314', (byte)'\315', (byte)'\316', (byte)'\317',
        (byte)'\320', (byte)'\321', (byte)'\322', (byte)'\323', (byte)'\324', (byte)'\325', (byte)'\326', (byte)'\327',
        (byte)'\330', (byte)'\331', (byte)'\332', (byte)'\333', (byte)'\334', (byte)'\335', (byte)'\336', (byte)'\337',
        (byte)'\300', (byte)'\301', (byte)'\302', (byte)'\303', (byte)'\304', (byte)'\305', (byte)'\306', (byte)'\307',
        (byte)'\310', (byte)'\311', (byte)'\312', (byte)'\313', (byte)'\314', (byte)'\315', (byte)'\316', (byte)'\317',
        (byte)'\320', (byte)'\321', (byte)'\322', (byte)'\323', (byte)'\324', (byte)'\325', (byte)'\326', (byte)'\327',
        (byte)'\330', (byte)'\331', (byte)'\332', (byte)'\333', (byte)'\334', (byte)'\335', (byte)'\336', (byte)'\337'
    };
    
    static final int KOI8U_CaseFoldMap[][] = {
        { 0xa3, 0xb3 },
        { 0xa4, 0xb4 },
        { 0xa6, 0xb6 },
        { 0xa7, 0xb7 },
        { 0xad, 0xbd },

        { 0xc0, 0xe0 },
        { 0xc1, 0xe1 },
        { 0xc2, 0xe2 },
        { 0xc3, 0xe3 },
        { 0xc4, 0xe4 },
        { 0xc5, 0xe5 },
        { 0xc6, 0xe6 },
        { 0xc7, 0xe7 },
        { 0xc8, 0xe8 },
        { 0xc9, 0xe9 },
        { 0xca, 0xea },
        { 0xcb, 0xeb },
        { 0xcc, 0xec },
        { 0xcd, 0xed },
        { 0xce, 0xee },
        { 0xcf, 0xef },

        { 0xd0, 0xf0 },
        { 0xd1, 0xf1 },
        { 0xd2, 0xf2 },
        { 0xd3, 0xf3 },
        { 0xd4, 0xf4 },
        { 0xd5, 0xf5 },
        { 0xd6, 0xf6 },
        { 0xd7, 0xf7 },
        { 0xd8, 0xf8 },
        { 0xd9, 0xf9 },
        { 0xda, 0xfa },
        { 0xdb, 0xfb },
        { 0xdc, 0xfc },
        { 0xdd, 0xfd },
        { 0xde, 0xfe },
        { 0xdf, 0xff }      
    };

    public static final KOI8UEncoding INSTANCE = new KOI8UEncoding();
}
