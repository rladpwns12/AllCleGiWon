<template>
    <div style="margin: 0 -15px 0 -15px;">
        <v-card-title>
            Department
        </v-card-title>
        <v-card-text>
            <div v-if="editMode" style="margin-top:-20px;">
                <v-select
                        v-model="newValue"
                        :label="'Department'"
                        :items="departmentList"
                ></v-select>
            </div>
            <div v-else style="margin-top:-20px;">
                Department : {{ value }}
            </div>
        </v-card-text>
    </div>
</template>

<script>
    export default {
        name: 'Department',
        components:{},
        props: {
            value: [Object, String, Number, Boolean, Array],
            editMode: Boolean,
            isNew: Boolean,
            offline: Boolean,
            inList: Boolean,
            label: String,
        },
        data: () => ({
            departmentList : [ "CHRISTIAN_STUDIES",  "KOREAN_LANGUAGE_AND_LITERATURE",  "ENGLISH_LANGUAGE_AND_LITERATURE",  "GERMAN_LANGUAGE_AND_LITERATURE",  "FRENCH_LANGUAGE_AND_LITERATURE",  "CHINESE_LANGUAGE_AND_LITERATURE",  "MATHEMATICS",  "PHYSICS",  "CHEMISTRY",  "STATISTICS_AND_ACTUARIAL_SCIENCE",  "SCHOOL_OF_SYSTEMS_BIOMEDICAL_SCIENCE",  "LAW",  "GLOBAL_LAW",  "SCHOOL_OF_SOCIAL_WELFARE",  "SCHOOL_OF_PUBLIC_ADMINISTRATION",  "POLITICAL_SCIENCE_AND_INTERNATIONAL_RELATIONS",  "ECONOMICS",  "GLOBAL_COMMERCE",  "SCHOOL_OF_BUSINESS_ADMINISTRATION",  "ENTREPRENEURSHIP_AND_SMALL_BUSINESS",  "ACCOUNTING",  "SCHOOL_OF_FINANCE",  "CHEMICAL_ENGINEERING",  "INDUSTRIAL_INFORMATION_SYSTEMS_ENGINEERING",  "SCHOOL_OF_ELECTRICAL_ENGINEERING",  "SCHOOL_OF_COMPUTING",  "SCHOOL_OF_ELECTRONIC_ENGINEERING",  "THE_GLOBAL_SCHOOL_OF_MEDIA",  "IT_CONVERGENCE",  "SMART_CARS",  "ENERGY_ENGINEERING",  "INFORMATION_PROTECTION",  "MODERN_MAN_AND_THE_BIBLE",  "THINKING_AND_EXPRESSION",  "COMPUTATIONAL_THINKING",  "DATA_AND_SOCIETY", ],
            newValue: '',
        }),
        async created() {
            if(!this.value) {
                this.newValue = this.departmentList[0];
            } else {
                this.newValue = this.value;
            }
        },
        watch: {
            value(val) {
                this.$emit('input', val);
            },
            newValue(val) {
                this.$emit('input', val);
            },
        },
        methods: {
        }
    }
</script>

