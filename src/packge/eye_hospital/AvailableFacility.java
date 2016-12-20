package packge.eye_hospital;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.app.Activity;

public class AvailableFacility extends Activity {

	EditText a,b;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.facility);
	a=(EditText)findViewById(R.id.wl);
	b=(EditText)findViewById(R.id.es);
	

	
	a.setText("->WaveLight® EX500 Excimer Laser Built for Speed and Superb Outcomes\nFeaturing a 500 Hz repetition rate, the WaveLight® EX500 Excimer Laser delivers the world’s fastest ablation times at only 1.4 seconds per diopter,* resulting in consistent outcomes.\nIts innovative engineering helps reduce the potential for:\n- Stromal dehydration of the cornea\n- Flap shrinkage\n- Sensitivity to eye movements\n-Patient fixation fatigue"+"\n"
	+"\n\n->Digital Fundus Camera (for Fundus Fluorescein Angiography)\nIn the rapidly developing technology of digital cameras, retinal imaging techniques advance quickly and newer methods. New diagnostic modes and procedures require versatility, precision and reliability The Topcon TRC-50DX, as well as the TRC-50DX(Type IA), improves on the unsurpassed quality incorporating new functions that enhance their versatility and operational ease. The camera can photo devices, from 35mm camera backs to super-high resolution digital cameras.\n\nThe TRC-50DX : Leading the way in retinal cameras."
	+"\n\n->Applanation Tomometry The Applanation Tonometer from the house of Tisha medical export comes utilized for measuring engineered for the purpose of complete surface mounting onto the microscope. We have enabled comes to as a mechanism to that comes towards the front for the sake of better clarity and vision"
	+"\n\n->Non-contact Tomometer (NCT) The non-contact tonometer is an applanation tonometer and works on the principle of a time takes from the initial generation of the puff of air to where the cornea is exactly flattened (in the timing device stops. It takes less time for the puff of air to flatten a soft eye than it does"
	+"\n\n->Automated Humphery Field Analyzer (HFA-II)"
	+"\n\n->Ultrasound Scan (A & B) The applications of ultrasound machines are numerous and commonly used for obstetrics, echocardiography name a few. Ultrasound Machines is a non-invasive way to provide valuable medical details compare diagnosis techniques. In other word, it has greatly helped medicine become safer and more accurate. functions of the process."
	+("\n\n->Corneal Topography Corneal topography, often referred to as photokeratoscopy or videokeratography, is a technology optometrists in the eye care health field. It uses computerized equipment and analytic software curvature of the human cornea. Using a unique system of concentric rings projected onto a person's created from which calculations are made to determine cornea curvature."
	+"\n\n->Pachymeter A pachymeter is a medical device used to measure the thickness of the eye's cornea. It is used prior to LASIK surgery, for Keratoconus screening, LRI surgery [1] and is useful in screening for glaucoma among other uses. Modern devices use ultrasound technology , while earlier models The ultrasonic Pachymeters traditionally have been devices that provide the thickness of the human number in micrometres that is displayed to the user"
	+"\n\n->TOPCON Auto-refractometer"
	+"\n\n->TOPCON Slit Lamps"
	+"\n\n->Streak Retinoscope and Direct Ophthalmoscopes Streak Retinoscope is an Ophthalmic Instrument which is used to objectively determine the refractive It is a Streak and Spot Retinoscope in one and is converted by simply changing the bulb. Retinoscope in case or zipper pouch packing."
	+"\n\n->Heines Indirect Ophthalmoscopes"
	+"\n\n->Automated Refraction Units"
	+"\n\n->Ophthalmic Cryo Units")
	+"\n\n->High Speed Automated Autoclave These machines are carefully fabricated using high grade basic material and electrical components vendors in the market.\n Intricate engineering and superior features of these equipment have resulted safe & easy operations, energy efficiency and dimensional accuracy in the end products.\n The all in one optical biometer LENSTAR LS900® provides the user with a complete biometrical in a single measurement procedure, including lens thickness, anterior chamber depth (lens position)\n\n • The all in one biometer, keratometer, pachymeter, pupillometer and IOL calculator Get up including lens thickness.\n • All measurements using laser optical technology Align once, get all results.\n • Measurements on the visual axis Highly reproducible results on all parameters.\n\n\n Measurements:\n 1. Optical coherence biometry revolutionised cataract surgery, the LENSTAR is about to revolutionise\n 2. Central Corneal Thickness (CCT)\n 3. Anterior Chamber Depth (ACD)"
	+"4. Lens Thickness (LT)\n 5. Axial Length (AL)\n 6. Retinal Thickness (RT)\n 7. Keratometry\n 8. White to White Distance\n 9. Pupillometry\n 10. Eccentricity of the Visual Axis\n 11. Special Eye Conditions");
	b.setText("Eye Suite Biometry\n\n In addition to the ease of using only a single measurement, the LENSTAR® also provides a user-navigation of the software interface.\n This allows even inexperienced persons to easily begin to training.\n Measurements can be performed by assistants, thus improving the efficiency of the clinic.\n • User-friendly and ergonomic\n • Best measurements for optimum IOL prediction\n • Ready for the future in IOL power calculation\n • Intuitive and open");
	a.setEnabled(false);
	b.setEnabled(false);
	}

}
 