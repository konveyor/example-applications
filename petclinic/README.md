# Modernize Petclinic App to Kubernetes Using Konveyor

The Petclinic app has been modified to replicate the behavior of a real-world enterprise application. In this updated version, Hazelcast is used as the backing store to handle anonymous users’ sessions. The application leverages Spring Session management, which facilitates clustered sessions beyond the limitations of an application container-specific solution. Consequently, multiple instances of the Petclinic application can utilize a shared store for user sessions. In this example, the Petclinic application instances utilize Hazelcast as an HTTP session store, enabling the instances to share sessions. This setup guarantees uninterrupted user sessions even if an instance becomes unavailable.

### Goals
* This example will explore the reasons behind the failed attempt to lift and shift the petclinic app to Kubernetes.
* We will leverage the lessons learned from this experience to develop custom rules and a target. We will then use the custom target with the Konveyor Analyzer module to analyze the application.
* By implementing the recommended changes identified in the preceding step, we will refactor and deploy the app to Kubernetes.

### Prerequisites
* EKS v1.25 or above
* Konveyor Operator

### Instructions

Follow along the steps outlined in this [post](https://www.konveyor.io/blog/modernize-petclinic-to-k8s-using-konveyor/#walkthrough)

### References
* Source code is available [here](https://github.com/konveyor/spring-framework-petclinic/tree/legacy)