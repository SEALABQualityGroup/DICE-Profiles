/**
 */
package es.unizar.disco.dice.DTSM.Spark.impl;

import com.masdes.dam.Basic_Data_Types.Basic_Data_TypesPackage;

import com.masdes.dam.Basic_Enumeration_Types.Basic_Enumeration_TypesPackage;

import com.masdes.dam.Complex_Data_Types.Complex_Data_TypesPackage;

import com.masdes.dam.DAM.DAMPackage;

import es.unizar.disco.dice.Basic_Enumeration_Types.impl.Basic_Enumeration_TypesPackageImpl;

import es.unizar.disco.dice.Complex_Data_Types.impl.Complex_Data_TypesPackageImpl;

import es.unizar.disco.dice.DDSM.DDSMPackage;

import es.unizar.disco.dice.DDSM.impl.DDSMPackageImpl;
import es.unizar.disco.dice.DICE.DICEPackage;
import es.unizar.disco.dice.DICE.impl.DICEPackageImpl;
import es.unizar.disco.dice.DPIM.DPIMPackage;

import es.unizar.disco.dice.DPIM.impl.DPIMPackageImpl;

import es.unizar.disco.dice.DTSM.Cassandra.CassandraPackage;

import es.unizar.disco.dice.DTSM.Cassandra.impl.CassandraPackageImpl;

import es.unizar.disco.dice.DTSM.Core.CorePackage;

import es.unizar.disco.dice.DTSM.Core.impl.CorePackageImpl;

import es.unizar.disco.dice.DTSM.Hadoop.HadoopPackage;

import es.unizar.disco.dice.DTSM.Hadoop.impl.HadoopPackageImpl;

import es.unizar.disco.dice.DTSM.Spark.SparkAction;
import es.unizar.disco.dice.DTSM.Spark.SparkFactory;
import es.unizar.disco.dice.DTSM.Spark.SparkNode;
import es.unizar.disco.dice.DTSM.Spark.SparkOperation;
import es.unizar.disco.dice.DTSM.Spark.SparkPackage;
import es.unizar.disco.dice.DTSM.Spark.SparkScenario;
import es.unizar.disco.dice.DTSM.Spark.SparkTransformation;
import es.unizar.disco.dice.DTSM.Spark.SparkWorkloadEvent;

import es.unizar.disco.dice.DTSM.Storm.StormPackage;

import es.unizar.disco.dice.DTSM.Storm.impl.StormPackageImpl;

import es.unizar.disco.dice.DTSM.Tez.TezPackage;
import es.unizar.disco.dice.DTSM.Tez.impl.TezPackageImpl;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.GQAM.GQAMPackage;

import org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.BasicNFP_TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SparkPackageImpl extends EPackageImpl implements SparkPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sparkScenarioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sparkOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sparkActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sparkTransformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sparkNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sparkWorkloadEventEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see es.unizar.disco.dice.DTSM.Spark.SparkPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SparkPackageImpl() {
		super(eNS_URI, SparkFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link SparkPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SparkPackage init() {
		if (isInited) return (SparkPackage)EPackage.Registry.INSTANCE.getEPackage(SparkPackage.eNS_URI);

		// Obtain or create and register package
		SparkPackageImpl theSparkPackage = (SparkPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SparkPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SparkPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		DAMPackage.eINSTANCE.eClass();
		Complex_Data_TypesPackage.eINSTANCE.eClass();
		Basic_Data_TypesPackage.eINSTANCE.eClass();
		Basic_Enumeration_TypesPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		DICEPackageImpl theDICEPackage = (DICEPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DICEPackage.eNS_URI) instanceof DICEPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DICEPackage.eNS_URI) : DICEPackage.eINSTANCE);
		DPIMPackageImpl theDPIMPackage = (DPIMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DPIMPackage.eNS_URI) instanceof DPIMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DPIMPackage.eNS_URI) : DPIMPackage.eINSTANCE);
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
		StormPackageImpl theStormPackage = (StormPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StormPackage.eNS_URI) instanceof StormPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StormPackage.eNS_URI) : StormPackage.eINSTANCE);
		HadoopPackageImpl theHadoopPackage = (HadoopPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HadoopPackage.eNS_URI) instanceof HadoopPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HadoopPackage.eNS_URI) : HadoopPackage.eINSTANCE);
		CassandraPackageImpl theCassandraPackage = (CassandraPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CassandraPackage.eNS_URI) instanceof CassandraPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CassandraPackage.eNS_URI) : CassandraPackage.eINSTANCE);
		TezPackageImpl theTezPackage = (TezPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TezPackage.eNS_URI) instanceof TezPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TezPackage.eNS_URI) : TezPackage.eINSTANCE);
		DDSMPackageImpl theDDSMPackage = (DDSMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DDSMPackage.eNS_URI) instanceof DDSMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DDSMPackage.eNS_URI) : DDSMPackage.eINSTANCE);
		Complex_Data_TypesPackageImpl theComplex_Data_TypesPackage_1 = (Complex_Data_TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(es.unizar.disco.dice.Complex_Data_Types.Complex_Data_TypesPackage.eNS_URI) instanceof Complex_Data_TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(es.unizar.disco.dice.Complex_Data_Types.Complex_Data_TypesPackage.eNS_URI) : es.unizar.disco.dice.Complex_Data_Types.Complex_Data_TypesPackage.eINSTANCE);
		Basic_Enumeration_TypesPackageImpl theBasic_Enumeration_TypesPackage_1 = (Basic_Enumeration_TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(es.unizar.disco.dice.Basic_Enumeration_Types.Basic_Enumeration_TypesPackage.eNS_URI) instanceof Basic_Enumeration_TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(es.unizar.disco.dice.Basic_Enumeration_Types.Basic_Enumeration_TypesPackage.eNS_URI) : es.unizar.disco.dice.Basic_Enumeration_Types.Basic_Enumeration_TypesPackage.eINSTANCE);

		// Create package meta-data objects
		theSparkPackage.createPackageContents();
		theDICEPackage.createPackageContents();
		theDPIMPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theStormPackage.createPackageContents();
		theHadoopPackage.createPackageContents();
		theCassandraPackage.createPackageContents();
		theTezPackage.createPackageContents();
		theDDSMPackage.createPackageContents();
		theComplex_Data_TypesPackage_1.createPackageContents();
		theBasic_Enumeration_TypesPackage_1.createPackageContents();

		// Initialize created meta-data
		theSparkPackage.initializePackageContents();
		theDICEPackage.initializePackageContents();
		theDPIMPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theStormPackage.initializePackageContents();
		theHadoopPackage.initializePackageContents();
		theCassandraPackage.initializePackageContents();
		theTezPackage.initializePackageContents();
		theDDSMPackage.initializePackageContents();
		theComplex_Data_TypesPackage_1.initializePackageContents();
		theBasic_Enumeration_TypesPackage_1.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSparkPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SparkPackage.eNS_URI, theSparkPackage);
		return theSparkPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSparkScenario() {
		return sparkScenarioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSparkScenario_NAssignedCores() {
		return (EAttribute)sparkScenarioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSparkScenario_NAssignedMemory() {
		return (EAttribute)sparkScenarioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSparkScenario_SparkDefaultParallelism() {
		return (EAttribute)sparkScenarioEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSparkOperation() {
		return sparkOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSparkOperation_NumTasks() {
		return (EAttribute)sparkOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSparkOperation_OpType() {
		return (EAttribute)sparkOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSparkAction() {
		return sparkActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSparkAction_ReduceType() {
		return (EAttribute)sparkActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSparkTransformation() {
		return sparkTransformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSparkTransformation_MapType() {
		return (EAttribute)sparkTransformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSparkNode() {
		return sparkNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSparkNode_NCores() {
		return (EAttribute)sparkNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSparkNode_NMemory() {
		return (EAttribute)sparkNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSparkWorkloadEvent() {
		return sparkWorkloadEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSparkWorkloadEvent_SparkPopulation() {
		return (EAttribute)sparkWorkloadEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSparkWorkloadEvent_SparkExtDelay() {
		return (EAttribute)sparkWorkloadEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SparkFactory getSparkFactory() {
		return (SparkFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		sparkScenarioEClass = createEClass(SPARK_SCENARIO);
		createEAttribute(sparkScenarioEClass, SPARK_SCENARIO__NASSIGNED_CORES);
		createEAttribute(sparkScenarioEClass, SPARK_SCENARIO__NASSIGNED_MEMORY);
		createEAttribute(sparkScenarioEClass, SPARK_SCENARIO__SPARK_DEFAULT_PARALLELISM);

		sparkOperationEClass = createEClass(SPARK_OPERATION);
		createEAttribute(sparkOperationEClass, SPARK_OPERATION__NUM_TASKS);
		createEAttribute(sparkOperationEClass, SPARK_OPERATION__OP_TYPE);

		sparkActionEClass = createEClass(SPARK_ACTION);
		createEAttribute(sparkActionEClass, SPARK_ACTION__REDUCE_TYPE);

		sparkTransformationEClass = createEClass(SPARK_TRANSFORMATION);
		createEAttribute(sparkTransformationEClass, SPARK_TRANSFORMATION__MAP_TYPE);

		sparkNodeEClass = createEClass(SPARK_NODE);
		createEAttribute(sparkNodeEClass, SPARK_NODE__NCORES);
		createEAttribute(sparkNodeEClass, SPARK_NODE__NMEMORY);

		sparkWorkloadEventEClass = createEClass(SPARK_WORKLOAD_EVENT);
		createEAttribute(sparkWorkloadEventEClass, SPARK_WORKLOAD_EVENT__SPARK_POPULATION);
		createEAttribute(sparkWorkloadEventEClass, SPARK_WORKLOAD_EVENT__SPARK_EXT_DELAY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		com.masdes.dam.Core.CorePackage theCorePackage_1 = (com.masdes.dam.Core.CorePackage)EPackage.Registry.INSTANCE.getEPackage(com.masdes.dam.Core.CorePackage.eNS_URI);
		BasicNFP_TypesPackage theBasicNFP_TypesPackage = (BasicNFP_TypesPackage)EPackage.Registry.INSTANCE.getEPackage(BasicNFP_TypesPackage.eNS_URI);
		GQAMPackage theGQAMPackage = (GQAMPackage)EPackage.Registry.INSTANCE.getEPackage(GQAMPackage.eNS_URI);
		es.unizar.disco.dice.Basic_Enumeration_Types.Basic_Enumeration_TypesPackage theBasic_Enumeration_TypesPackage_1 = (es.unizar.disco.dice.Basic_Enumeration_Types.Basic_Enumeration_TypesPackage)EPackage.Registry.INSTANCE.getEPackage(es.unizar.disco.dice.Basic_Enumeration_Types.Basic_Enumeration_TypesPackage.eNS_URI);
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		sparkScenarioEClass.getESuperTypes().add(theCorePackage_1.getDaService());
		sparkOperationEClass.getESuperTypes().add(theGQAMPackage.getGaStep());
		sparkActionEClass.getESuperTypes().add(this.getSparkOperation());
		sparkTransformationEClass.getESuperTypes().add(this.getSparkOperation());
		sparkNodeEClass.getESuperTypes().add(theCorePackage.getCoreComputationNode());
		sparkNodeEClass.getESuperTypes().add(theGQAMPackage.getGaScenario());
		sparkWorkloadEventEClass.getESuperTypes().add(theGQAMPackage.getGaWorkloadEvent());

		// Initialize classes and features; add operations and parameters
		initEClass(sparkScenarioEClass, SparkScenario.class, "SparkScenario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSparkScenario_NAssignedCores(), theBasicNFP_TypesPackage.getNFP_Integer(), "nAssignedCores", null, 1, 1, SparkScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSparkScenario_NAssignedMemory(), theBasicNFP_TypesPackage.getNFP_Integer(), "nAssignedMemory", null, 1, 1, SparkScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSparkScenario_SparkDefaultParallelism(), theBasicNFP_TypesPackage.getNFP_Integer(), "sparkDefaultParallelism", null, 1, 1, SparkScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(sparkOperationEClass, SparkOperation.class, "SparkOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSparkOperation_NumTasks(), theBasicNFP_TypesPackage.getNFP_Integer(), "numTasks", null, 1, 1, SparkOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSparkOperation_OpType(), theBasic_Enumeration_TypesPackage_1.getSparkOperation(), "OpType", null, 1, 1, SparkOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(sparkActionEClass, SparkAction.class, "SparkAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSparkAction_ReduceType(), theBasic_Enumeration_TypesPackage_1.getSparkAction(), "ReduceType", null, 1, 1, SparkAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(sparkTransformationEClass, SparkTransformation.class, "SparkTransformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSparkTransformation_MapType(), theBasic_Enumeration_TypesPackage_1.getSparkTransformation(), "MapType", null, 1, 1, SparkTransformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(sparkNodeEClass, SparkNode.class, "SparkNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSparkNode_NCores(), theBasicNFP_TypesPackage.getNFP_Integer(), "nCores", null, 1, 1, SparkNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSparkNode_NMemory(), theBasicNFP_TypesPackage.getNFP_Integer(), "nMemory", null, 1, 1, SparkNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(sparkWorkloadEventEClass, SparkWorkloadEvent.class, "SparkWorkloadEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSparkWorkloadEvent_SparkPopulation(), theBasicNFP_TypesPackage.getNFP_Integer(), "sparkPopulation", null, 1, 1, SparkWorkloadEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSparkWorkloadEvent_SparkExtDelay(), theBasicNFP_TypesPackage.getNFP_Duration(), "sparkExtDelay", null, 1, 1, SparkWorkloadEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
	}

} //SparkPackageImpl
