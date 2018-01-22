/**
 */
package es.unizar.disco.dice.Basic_Enumeration_Types.impl;

import com.masdes.dam.Basic_Data_Types.Basic_Data_TypesPackage;

import com.masdes.dam.Complex_Data_Types.Complex_Data_TypesPackage;

import com.masdes.dam.DAM.DAMPackage;

import es.unizar.disco.dice.Basic_Enumeration_Types.Basic_Enumeration_TypesFactory;
import es.unizar.disco.dice.Basic_Enumeration_Types.Basic_Enumeration_TypesPackage;
import es.unizar.disco.dice.Basic_Enumeration_Types.CassandraConsistencyLevelType;
import es.unizar.disco.dice.Basic_Enumeration_Types.ComputationType;
import es.unizar.disco.dice.Basic_Enumeration_Types.ConstraintType;
import es.unizar.disco.dice.Basic_Enumeration_Types.DDSMcomponentType;
import es.unizar.disco.dice.Basic_Enumeration_Types.DataMovementType;
import es.unizar.disco.dice.Basic_Enumeration_Types.LanguageType;
import es.unizar.disco.dice.Basic_Enumeration_Types.LifeCycleElementType;
import es.unizar.disco.dice.Basic_Enumeration_Types.MapType;
import es.unizar.disco.dice.Basic_Enumeration_Types.ProcessingType;
import es.unizar.disco.dice.Basic_Enumeration_Types.ProviderType;
import es.unizar.disco.dice.Basic_Enumeration_Types.ReduceType;
import es.unizar.disco.dice.Basic_Enumeration_Types.RefDataFormatType;
import es.unizar.disco.dice.Basic_Enumeration_Types.RefType;
import es.unizar.disco.dice.Basic_Enumeration_Types.Scheduling;
import es.unizar.disco.dice.Basic_Enumeration_Types.SourceType;
import es.unizar.disco.dice.Basic_Enumeration_Types.SparkAction;
import es.unizar.disco.dice.Basic_Enumeration_Types.SparkOperation;
import es.unizar.disco.dice.Basic_Enumeration_Types.SparkTransformation;
import es.unizar.disco.dice.Basic_Enumeration_Types.StreamPolicy;
import es.unizar.disco.dice.Basic_Enumeration_Types.TechType;
import es.unizar.disco.dice.Basic_Enumeration_Types.VMSize;
import es.unizar.disco.dice.Basic_Enumeration_Types.WorkflowOperation;

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

import es.unizar.disco.dice.DTSM.Spark.SparkPackage;

import es.unizar.disco.dice.DTSM.Spark.impl.SparkPackageImpl;

import es.unizar.disco.dice.DTSM.Storm.StormPackage;

import es.unizar.disco.dice.DTSM.Storm.impl.StormPackageImpl;

import es.unizar.disco.dice.DTSM.Tez.TezPackage;
import es.unizar.disco.dice.DTSM.Tez.impl.TezPackageImpl;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Basic_Enumeration_TypesPackageImpl extends EPackageImpl implements Basic_Enumeration_TypesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum refTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum refDataFormatTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum vmSizeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum techTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum processingTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sourceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum constraintTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum workflowOperationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum mapTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum reduceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum streamPolicyEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum schedulingEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum providerTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum lifeCycleElementTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ddsMcomponentTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sparkActionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sparkTransformationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sparkOperationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum languageTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataMovementTypeEEnum = null;

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cassandraConsistencyLevelTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum computationTypeEEnum = null;

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
	 * @see es.unizar.disco.dice.Basic_Enumeration_Types.Basic_Enumeration_TypesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Basic_Enumeration_TypesPackageImpl() {
		super(eNS_URI, Basic_Enumeration_TypesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Basic_Enumeration_TypesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Basic_Enumeration_TypesPackage init() {
		if (isInited) return (Basic_Enumeration_TypesPackage)EPackage.Registry.INSTANCE.getEPackage(Basic_Enumeration_TypesPackage.eNS_URI);

		// Obtain or create and register package
		Basic_Enumeration_TypesPackageImpl theBasic_Enumeration_TypesPackage = (Basic_Enumeration_TypesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Basic_Enumeration_TypesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Basic_Enumeration_TypesPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		DAMPackage.eINSTANCE.eClass();
		Complex_Data_TypesPackage.eINSTANCE.eClass();
		Basic_Data_TypesPackage.eINSTANCE.eClass();
		com.masdes.dam.Basic_Enumeration_Types.Basic_Enumeration_TypesPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		DICEPackageImpl theDICEPackage = (DICEPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DICEPackage.eNS_URI) instanceof DICEPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DICEPackage.eNS_URI) : DICEPackage.eINSTANCE);
		DPIMPackageImpl theDPIMPackage = (DPIMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DPIMPackage.eNS_URI) instanceof DPIMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DPIMPackage.eNS_URI) : DPIMPackage.eINSTANCE);
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
		StormPackageImpl theStormPackage = (StormPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StormPackage.eNS_URI) instanceof StormPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StormPackage.eNS_URI) : StormPackage.eINSTANCE);
		HadoopPackageImpl theHadoopPackage = (HadoopPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HadoopPackage.eNS_URI) instanceof HadoopPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HadoopPackage.eNS_URI) : HadoopPackage.eINSTANCE);
		SparkPackageImpl theSparkPackage = (SparkPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SparkPackage.eNS_URI) instanceof SparkPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SparkPackage.eNS_URI) : SparkPackage.eINSTANCE);
		CassandraPackageImpl theCassandraPackage = (CassandraPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CassandraPackage.eNS_URI) instanceof CassandraPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CassandraPackage.eNS_URI) : CassandraPackage.eINSTANCE);
		TezPackageImpl theTezPackage = (TezPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TezPackage.eNS_URI) instanceof TezPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TezPackage.eNS_URI) : TezPackage.eINSTANCE);
		DDSMPackageImpl theDDSMPackage = (DDSMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DDSMPackage.eNS_URI) instanceof DDSMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DDSMPackage.eNS_URI) : DDSMPackage.eINSTANCE);
		Complex_Data_TypesPackageImpl theComplex_Data_TypesPackage_1 = (Complex_Data_TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(es.unizar.disco.dice.Complex_Data_Types.Complex_Data_TypesPackage.eNS_URI) instanceof Complex_Data_TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(es.unizar.disco.dice.Complex_Data_Types.Complex_Data_TypesPackage.eNS_URI) : es.unizar.disco.dice.Complex_Data_Types.Complex_Data_TypesPackage.eINSTANCE);

		// Create package meta-data objects
		theBasic_Enumeration_TypesPackage.createPackageContents();
		theDICEPackage.createPackageContents();
		theDPIMPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theStormPackage.createPackageContents();
		theHadoopPackage.createPackageContents();
		theSparkPackage.createPackageContents();
		theCassandraPackage.createPackageContents();
		theTezPackage.createPackageContents();
		theDDSMPackage.createPackageContents();
		theComplex_Data_TypesPackage_1.createPackageContents();

		// Initialize created meta-data
		theBasic_Enumeration_TypesPackage.initializePackageContents();
		theDICEPackage.initializePackageContents();
		theDPIMPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theStormPackage.initializePackageContents();
		theHadoopPackage.initializePackageContents();
		theSparkPackage.initializePackageContents();
		theCassandraPackage.initializePackageContents();
		theTezPackage.initializePackageContents();
		theDDSMPackage.initializePackageContents();
		theComplex_Data_TypesPackage_1.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBasic_Enumeration_TypesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Basic_Enumeration_TypesPackage.eNS_URI, theBasic_Enumeration_TypesPackage);
		return theBasic_Enumeration_TypesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRefType() {
		return refTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRefDataFormatType() {
		return refDataFormatTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVMSize() {
		return vmSizeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTechType() {
		return techTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProcessingType() {
		return processingTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSourceType() {
		return sourceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConstraintType() {
		return constraintTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getWorkflowOperation() {
		return workflowOperationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMapType() {
		return mapTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getReduceType() {
		return reduceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStreamPolicy() {
		return streamPolicyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getScheduling() {
		return schedulingEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProviderType() {
		return providerTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLifeCycleElementType() {
		return lifeCycleElementTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDDSMcomponentType() {
		return ddsMcomponentTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSparkAction() {
		return sparkActionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSparkTransformation() {
		return sparkTransformationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSparkOperation() {
		return sparkOperationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLanguageType() {
		return languageTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDataMovementType() {
		return dataMovementTypeEEnum;
	}
  
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
  public EEnum getCassandraConsistencyLevelType() {
		return cassandraConsistencyLevelTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getComputationType() {
		return computationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Basic_Enumeration_TypesFactory getBasic_Enumeration_TypesFactory() {
		return (Basic_Enumeration_TypesFactory)getEFactoryInstance();
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

		// Create enums
		refTypeEEnum = createEEnum(REF_TYPE);
		refDataFormatTypeEEnum = createEEnum(REF_DATA_FORMAT_TYPE);
		vmSizeEEnum = createEEnum(VM_SIZE);
		techTypeEEnum = createEEnum(TECH_TYPE);
		processingTypeEEnum = createEEnum(PROCESSING_TYPE);
		sourceTypeEEnum = createEEnum(SOURCE_TYPE);
		constraintTypeEEnum = createEEnum(CONSTRAINT_TYPE);
		workflowOperationEEnum = createEEnum(WORKFLOW_OPERATION);
		mapTypeEEnum = createEEnum(MAP_TYPE);
		reduceTypeEEnum = createEEnum(REDUCE_TYPE);
		streamPolicyEEnum = createEEnum(STREAM_POLICY);
		schedulingEEnum = createEEnum(SCHEDULING);
		providerTypeEEnum = createEEnum(PROVIDER_TYPE);
		lifeCycleElementTypeEEnum = createEEnum(LIFE_CYCLE_ELEMENT_TYPE);
		ddsMcomponentTypeEEnum = createEEnum(DDS_MCOMPONENT_TYPE);
		sparkActionEEnum = createEEnum(SPARK_ACTION);
		sparkTransformationEEnum = createEEnum(SPARK_TRANSFORMATION);
		sparkOperationEEnum = createEEnum(SPARK_OPERATION);
		languageTypeEEnum = createEEnum(LANGUAGE_TYPE);
		cassandraConsistencyLevelTypeEEnum = createEEnum(CASSANDRA_CONSISTENCY_LEVEL_TYPE);
		dataMovementTypeEEnum = createEEnum(DATA_MOVEMENT_TYPE);
		computationTypeEEnum = createEEnum(COMPUTATION_TYPE);
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

		// Initialize enums and add enum literals
		initEEnum(refTypeEEnum, RefType.class, "RefType");
		addEEnumLiteral(refTypeEEnum, RefType.CASSANDRA);
		addEEnumLiteral(refTypeEEnum, RefType.HDFS);
		addEEnumLiteral(refTypeEEnum, RefType.MONGODB);
		addEEnumLiteral(refTypeEEnum, RefType.MYSQL);

		initEEnum(refDataFormatTypeEEnum, RefDataFormatType.class, "RefDataFormatType");
		addEEnumLiteral(refDataFormatTypeEEnum, RefDataFormatType.JSON);
		addEEnumLiteral(refDataFormatTypeEEnum, RefDataFormatType.PLAIN);
		addEEnumLiteral(refDataFormatTypeEEnum, RefDataFormatType.XML);
		addEEnumLiteral(refDataFormatTypeEEnum, RefDataFormatType.AVRO);
		addEEnumLiteral(refDataFormatTypeEEnum, RefDataFormatType.PARQUET);
		addEEnumLiteral(refDataFormatTypeEEnum, RefDataFormatType.YAML);

		initEEnum(vmSizeEEnum, VMSize.class, "VMSize");
		addEEnumLiteral(vmSizeEEnum, VMSize.SMALL);
		addEEnumLiteral(vmSizeEEnum, VMSize.MEDIUM);
		addEEnumLiteral(vmSizeEEnum, VMSize.LARGE);

		initEEnum(techTypeEEnum, TechType.class, "TechType");
		addEEnumLiteral(techTypeEEnum, TechType.HADOOP);
		addEEnumLiteral(techTypeEEnum, TechType.SPARK);
		addEEnumLiteral(techTypeEEnum, TechType.STORM);
		addEEnumLiteral(techTypeEEnum, TechType.ORYX2);

		initEEnum(processingTypeEEnum, ProcessingType.class, "ProcessingType");
		addEEnumLiteral(processingTypeEEnum, ProcessingType.STREAM);
		addEEnumLiteral(processingTypeEEnum, ProcessingType.BATCH);

		initEEnum(sourceTypeEEnum, SourceType.class, "SourceType");
		addEEnumLiteral(sourceTypeEEnum, SourceType.DATA_STREAM);
		addEEnumLiteral(sourceTypeEEnum, SourceType.WEBAPI);

		initEEnum(constraintTypeEEnum, ConstraintType.class, "ConstraintType");
		addEEnumLiteral(constraintTypeEEnum, ConstraintType.LESS);
		addEEnumLiteral(constraintTypeEEnum, ConstraintType.LESS_EQUAL);
		addEEnumLiteral(constraintTypeEEnum, ConstraintType.EQUAL);
		addEEnumLiteral(constraintTypeEEnum, ConstraintType.GREATER_EQUAL);
		addEEnumLiteral(constraintTypeEEnum, ConstraintType.GREATER);

		initEEnum(workflowOperationEEnum, WorkflowOperation.class, "WorkflowOperation");
		addEEnumLiteral(workflowOperationEEnum, WorkflowOperation.GROUP_BY);
		addEEnumLiteral(workflowOperationEEnum, WorkflowOperation.SUM);
		addEEnumLiteral(workflowOperationEEnum, WorkflowOperation.COUNT);
		addEEnumLiteral(workflowOperationEEnum, WorkflowOperation.SPLIT);

		initEEnum(mapTypeEEnum, MapType.class, "MapType");
		addEEnumLiteral(mapTypeEEnum, MapType.REGEX_MAPPER);
		addEEnumLiteral(mapTypeEEnum, MapType.FIELD_SELECTION_MAPPER);
		addEEnumLiteral(mapTypeEEnum, MapType.CHAIN_MAPPER);

		initEEnum(reduceTypeEEnum, ReduceType.class, "ReduceType");
		addEEnumLiteral(reduceTypeEEnum, ReduceType.FIELD_SELECTION_REDUCER);
		addEEnumLiteral(reduceTypeEEnum, ReduceType.CHAIN_REDUCER);
		addEEnumLiteral(reduceTypeEEnum, ReduceType.INT_SUM_REDUCER);

		initEEnum(streamPolicyEEnum, StreamPolicy.class, "StreamPolicy");
		addEEnumLiteral(streamPolicyEEnum, StreamPolicy.ALL);
		addEEnumLiteral(streamPolicyEEnum, StreamPolicy.SHUFFLE);
		addEEnumLiteral(streamPolicyEEnum, StreamPolicy.FIELD);
		addEEnumLiteral(streamPolicyEEnum, StreamPolicy.GLOBAL);

		initEEnum(schedulingEEnum, Scheduling.class, "Scheduling");
		addEEnumLiteral(schedulingEEnum, Scheduling.CAPACITY);
		addEEnumLiteral(schedulingEEnum, Scheduling.FIFO);
		addEEnumLiteral(schedulingEEnum, Scheduling.FAIR);

		initEEnum(providerTypeEEnum, ProviderType.class, "ProviderType");
		addEEnumLiteral(providerTypeEEnum, ProviderType.FCO);
		addEEnumLiteral(providerTypeEEnum, ProviderType.OPENSTACK);
		addEEnumLiteral(providerTypeEEnum, ProviderType.AWS);

		initEEnum(lifeCycleElementTypeEEnum, LifeCycleElementType.class, "LifeCycleElementType");
		addEEnumLiteral(lifeCycleElementTypeEEnum, LifeCycleElementType.START);
		addEEnumLiteral(lifeCycleElementTypeEEnum, LifeCycleElementType.STOP);
		addEEnumLiteral(lifeCycleElementTypeEEnum, LifeCycleElementType.INSTALL);
		addEEnumLiteral(lifeCycleElementTypeEEnum, LifeCycleElementType.CREATE);
		addEEnumLiteral(lifeCycleElementTypeEEnum, LifeCycleElementType.DOWNLOAD);
		addEEnumLiteral(lifeCycleElementTypeEEnum, LifeCycleElementType.PRECONFIGURED);

		initEEnum(ddsMcomponentTypeEEnum, DDSMcomponentType.class, "DDSMcomponentType");
		addEEnumLiteral(ddsMcomponentTypeEEnum, DDSMcomponentType.MASTER_SLAVE_PLATFORM);
		addEEnumLiteral(ddsMcomponentTypeEEnum, DDSMcomponentType.PEER_TO_PEER_PLATFORM);
		addEEnumLiteral(ddsMcomponentTypeEEnum, DDSMcomponentType.PEER_NODE);
		addEEnumLiteral(ddsMcomponentTypeEEnum, DDSMcomponentType.PEERS_QUORUM);
		addEEnumLiteral(ddsMcomponentTypeEEnum, DDSMcomponentType.CASSANDRA_SEED);
		addEEnumLiteral(ddsMcomponentTypeEEnum, DDSMcomponentType.MASTER_NODE);
		addEEnumLiteral(ddsMcomponentTypeEEnum, DDSMcomponentType.SLAVE_NODE);

		initEEnum(sparkActionEEnum, SparkAction.class, "SparkAction");
		addEEnumLiteral(sparkActionEEnum, SparkAction.REDUCE);
		addEEnumLiteral(sparkActionEEnum, SparkAction.SAMPLE);
		addEEnumLiteral(sparkActionEEnum, SparkAction.COLLECT);
		addEEnumLiteral(sparkActionEEnum, SparkAction.COUNT);
		addEEnumLiteral(sparkActionEEnum, SparkAction.SAVE_AS);
		addEEnumLiteral(sparkActionEEnum, SparkAction.COUNT_BY_KEY);
		addEEnumLiteral(sparkActionEEnum, SparkAction.FOR_EACH);
		addEEnumLiteral(sparkActionEEnum, SparkAction.AGGREGATE);
		addEEnumLiteral(sparkActionEEnum, SparkAction.COLLECT_AS_MAP);
		addEEnumLiteral(sparkActionEEnum, SparkAction.COUNT_BY_VALUE);
		addEEnumLiteral(sparkActionEEnum, SparkAction.FOLD);
		addEEnumLiteral(sparkActionEEnum, SparkAction.LOOKUP);
		addEEnumLiteral(sparkActionEEnum, SparkAction.TAKE);
		addEEnumLiteral(sparkActionEEnum, SparkAction.TOP);

		initEEnum(sparkTransformationEEnum, SparkTransformation.class, "SparkTransformation");
		addEEnumLiteral(sparkTransformationEEnum, SparkTransformation.MAP);
		addEEnumLiteral(sparkTransformationEEnum, SparkTransformation.FILTER);
		addEEnumLiteral(sparkTransformationEEnum, SparkTransformation.SAMPLE);
		addEEnumLiteral(sparkTransformationEEnum, SparkTransformation.RDD_SET_OPERATION);
		addEEnumLiteral(sparkTransformationEEnum, SparkTransformation.UNION);
		addEEnumLiteral(sparkTransformationEEnum, SparkTransformation.INTERSECTION);
		addEEnumLiteral(sparkTransformationEEnum, SparkTransformation.SUBSTRACTION);
		addEEnumLiteral(sparkTransformationEEnum, SparkTransformation.SUBTRACT);
		addEEnumLiteral(sparkTransformationEEnum, SparkTransformation.DISTINCT);
		addEEnumLiteral(sparkTransformationEEnum, SparkTransformation.BY_KEY);
		addEEnumLiteral(sparkTransformationEEnum, SparkTransformation.COMBINE_BY_KEY);
		addEEnumLiteral(sparkTransformationEEnum, SparkTransformation.GROUP_BY_KEY);
		addEEnumLiteral(sparkTransformationEEnum, SparkTransformation.REDUCE_BY_KEY);
		addEEnumLiteral(sparkTransformationEEnum, SparkTransformation.SORT_BY_KEY);
		addEEnumLiteral(sparkTransformationEEnum, SparkTransformation.JOIN);
		addEEnumLiteral(sparkTransformationEEnum, SparkTransformation.CARTESIAN);
		addEEnumLiteral(sparkTransformationEEnum, SparkTransformation.REPARTITION);
		addEEnumLiteral(sparkTransformationEEnum, SparkTransformation.COGROUP);
		addEEnumLiteral(sparkTransformationEEnum, SparkTransformation.FLAT_MAP);
		addEEnumLiteral(sparkTransformationEEnum, SparkTransformation.GROUP_WITH);
		addEEnumLiteral(sparkTransformationEEnum, SparkTransformation.KEYS);
		addEEnumLiteral(sparkTransformationEEnum, SparkTransformation.MAP_VALUES);
		addEEnumLiteral(sparkTransformationEEnum, SparkTransformation.PARTITION_BY);
		addEEnumLiteral(sparkTransformationEEnum, SparkTransformation.THE_VALUES);
		addEEnumLiteral(sparkTransformationEEnum, SparkTransformation.TEXT_FILE);
		addEEnumLiteral(sparkTransformationEEnum, SparkTransformation.PARALLELIZE);

		initEEnum(sparkOperationEEnum, SparkOperation.class, "SparkOperation");
		addEEnumLiteral(sparkOperationEEnum, SparkOperation.TRANSFORMATION);
		addEEnumLiteral(sparkOperationEEnum, SparkOperation.ACTION);

		initEEnum(languageTypeEEnum, LanguageType.class, "LanguageType");
		addEEnumLiteral(languageTypeEEnum, LanguageType.BASH);
		addEEnumLiteral(languageTypeEEnum, LanguageType.PYTHON);
		addEEnumLiteral(languageTypeEEnum, LanguageType.JAVA);
		addEEnumLiteral(languageTypeEEnum, LanguageType.SCALA);
		addEEnumLiteral(languageTypeEEnum, LanguageType.R);

		initEEnum(cassandraConsistencyLevelTypeEEnum, CassandraConsistencyLevelType.class, "CassandraConsistencyLevelType");
		addEEnumLiteral(cassandraConsistencyLevelTypeEEnum, CassandraConsistencyLevelType.ONE);
		addEEnumLiteral(cassandraConsistencyLevelTypeEEnum, CassandraConsistencyLevelType.QUORUM);
		addEEnumLiteral(cassandraConsistencyLevelTypeEEnum, CassandraConsistencyLevelType.ALL);

		initEEnum(dataMovementTypeEEnum, DataMovementType.class, "DataMovementType");
		addEEnumLiteral(dataMovementTypeEEnum, DataMovementType.ONE_TO_ONE);
		addEEnumLiteral(dataMovementTypeEEnum, DataMovementType.SCATTER_GATHER);
		addEEnumLiteral(dataMovementTypeEEnum, DataMovementType.BROADCAST);

		initEEnum(computationTypeEEnum, ComputationType.class, "ComputationType");
		addEEnumLiteral(computationTypeEEnum, ComputationType.DISTRIBUTED);
		addEEnumLiteral(computationTypeEEnum, ComputationType.PARALLEL);
		addEEnumLiteral(computationTypeEEnum, ComputationType.DISTRIBUTED_PARALLEL);
		addEEnumLiteral(computationTypeEEnum, ComputationType.MICRO_BENCH);
		addEEnumLiteral(computationTypeEEnum, ComputationType.SORTING);
		addEEnumLiteral(computationTypeEEnum, ComputationType.GREP);
		addEEnumLiteral(computationTypeEEnum, ComputationType.WORD_COUNT);
		addEEnumLiteral(computationTypeEEnum, ComputationType.COLLAB_FILTERING);
		addEEnumLiteral(computationTypeEEnum, ComputationType.NAIVE_BAYES);
		addEEnumLiteral(computationTypeEEnum, ComputationType.BFS);
		addEEnumLiteral(computationTypeEEnum, ComputationType.PAGE_RANK);
		addEEnumLiteral(computationTypeEEnum, ComputationType.KMEANS);
		addEEnumLiteral(computationTypeEEnum, ComputationType.CONNECTED_COMPONENTS);
		addEEnumLiteral(computationTypeEEnum, ComputationType.REL_QUERY);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/uml2/2.0.0/UML
		createUMLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/uml2/2.0.0/UML</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUMLAnnotations() {
		String source = "http://www.eclipse.org/uml2/2.0.0/UML";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "originalName", "Enumeration_Types"
		   });
	}

} //Basic_Enumeration_TypesPackageImpl
