Functional requirements:
1. A user shall be able to select a list of courses, and remove selected courses from said list.
2. A user shall be able to create a list of constraints that generated schedules must abide by, and remove created constraints from said list.
    1. An "Inter-Class Break" shall be offered as a type of constraint, where the user specifies a duration<sup>[a]</sup> of time that must be present between the end of one class and the beginning of another class.
    2. An "Inflexible Break" shall be offered as a type of constraint, where the user specifies two times<sup>[b]</sup> between which no classes may be scheduled.
    3. A "Flexible Break" shall be offered as a type of constraint, where the user specifies one duration<sup>[a]</sup> and two times<sup>[b]</sup>. For a schedule to satisfy this constraint, there must be a contiguous block of time during which no classes are scheduled lasting at least as long as the duration specified by the user. Additionally, this block of time must occur between the two times specified by the user.
3. A user shall be able to generate a list of schedules. Each schedule in this list must...
    * contain one section of each course present in the course list (as specified in requirement 1),
    * satisfy all constraints present in the constraint list (as specified in requirement 2), and
    * not contain any sections that have overlapping meeting times. 

<sup>[a]</sup> In this context, "duration" is referring to a length of time, e.g., `15 minutes` or `1 hour`.  
<sup>[b]</sup> In this context, "two times" is referring to a starting time and ending time. These times consist of a time-of-day and at least one day-of-week, e.g., `Tu 8am` or `MWF 1:30pm`.

Non-functional requirements:  
* Product requirements:
    * Usability requirement - TODO
    * Efficiency requirements:
        * Performance requirement - TODO
        * Space requirement - TODO
    * Dependability requirement - TODO
    * Security requirement - TODO
* Organizational requirements:
    * Environmental requirement - TODO
    * Operational requirement - TODO
    * Development requirement - TODO
* External requirements:
    * Regulatory requirement - TODO
    * Ethical requirement - TODO
    * Legislative requirements:
        * Accounting requirement - TODO
        * Safety/security requirement - TODO
